package dev.alexengrig.util.sql;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class DetectiveResultSet extends ReadOnlyResultSet {

    protected Map<String, ColumnMetaData> columnMetaDataByName = new HashMap<>();
    protected int currentColumn = 1;

    protected String tableName;

    protected DetectiveResultSet(ResultSet rs, String tableName) {
        super(rs);
        this.tableName = tableName;
    }

    protected int findColumnByName(String columnName) throws SQLException {
        String targetName = columnName.toUpperCase();
        if (columnMetaDataByName.containsKey(targetName)) {
            return columnMetaDataByName.get(targetName).getIndex();
        }
        ResultSetMetaData metaData = getMetaData();
        for (int lastColumn = metaData.getColumnCount(); currentColumn <= lastColumn; currentColumn++) {
            if (tableName.equalsIgnoreCase(metaData.getTableName(currentColumn))) {
                ColumnMetaData columnMetaData = new ColumnMetaData(metaData, currentColumn);
                String name = columnMetaData.getName().toUpperCase();
                columnMetaDataByName.put(name, columnMetaData);
                if (targetName.equals(name)) {
                    return columnMetaData.getIndex();
                }
            }
        }
        throw new SQLException("No column name: " + targetName);
    }

    @Override
    public long getLong(String columnName) throws SQLException {
        int columnIndex = findColumnByName(columnName);
        return super.getLong(columnIndex);
    }

    @Override
    public String getString(String columnName) throws SQLException {
        int columnIndex = findColumnByName(columnName);
        return super.getString(columnIndex);
    }

}
