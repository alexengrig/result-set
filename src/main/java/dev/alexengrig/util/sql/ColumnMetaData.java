package dev.alexengrig.util.sql;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ColumnMetaData {

    protected final ResultSetMetaData metaData;
    protected final int column;

    protected ColumnMetaData(ResultSetMetaData metaData, int column) {
        this.metaData = metaData;
        this.column = column;
    }

    public int getIndex() {
        return column;
    }

    public String getLabel() throws SQLException {
        return metaData.getColumnLabel(column);
    }

    public String getName() throws SQLException {
        return metaData.getColumnName(column);
    }

    public String getCatalogName() throws SQLException {
        return metaData.getCatalogName(column);
    }

    public String getSchemaName() throws SQLException {
        return metaData.getSchemaName(column);
    }

    public String getTableName() throws SQLException {
        return metaData.getTableName(column);
    }

    public String getClassName() throws SQLException {
        return metaData.getColumnClassName(column);
    }

    public String getTypeName() throws SQLException {
        return metaData.getColumnTypeName(column);
    }

    public int getType() throws SQLException {
        return metaData.getColumnType(column);
    }

    public int getDisplaySize() throws SQLException {
        return metaData.getColumnDisplaySize(column);
    }

    public int getPrecision() throws SQLException {
        return metaData.getPrecision(column);
    }

    public int getScale() throws SQLException {
        return metaData.getScale(column);
    }

    public int isNullable() throws SQLException {
        return metaData.isNullable(column);
    }

    public boolean isAutoIncrement() throws SQLException {
        return metaData.isAutoIncrement(column);
    }

    public boolean isCaseSensitive() throws SQLException {
        return metaData.isCaseSensitive(column);
    }

    public boolean isSearchable() throws SQLException {
        return metaData.isSearchable(column);
    }

    public boolean isCurrency() throws SQLException {
        return metaData.isCurrency(column);
    }

    public boolean isSigned() throws SQLException {
        return metaData.isSigned(column);
    }

    public boolean isReadOnly() throws SQLException {
        return metaData.isReadOnly(column);
    }

    public boolean isWritable() throws SQLException {
        return metaData.isWritable(column);
    }

    public boolean isDefinitelyWritable() throws SQLException {
        return metaData.isDefinitelyWritable(column);
    }

}
