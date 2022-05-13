package dev.alexengrig.util.sql;

import java.sql.ResultSet;
import java.sql.SQLException;

public final class ResultSetUtil {

    private ResultSetUtil() {
    }

    public static Boolean getBoolean(ResultSet rs, int columnIndex) throws SQLException {
        boolean value = rs.getBoolean(columnIndex);
        if (rs.wasNull()) {
            return null;
        }
        return value;
    }

    public static Boolean getBoolean(ResultSet rs, String columnLabel) throws SQLException {
        boolean value = rs.getBoolean(columnLabel);
        if (rs.wasNull()) {
            return null;
        }
        return value;
    }

    public static Byte getByte(ResultSet rs, int columnIndex) throws SQLException {
        byte value = rs.getByte(columnIndex);
        if (rs.wasNull()) {
            return null;
        }
        return value;
    }

    public static Byte getByte(ResultSet rs, String columnLabel) throws SQLException {
        byte value = rs.getByte(columnLabel);
        if (rs.wasNull()) {
            return null;
        }
        return value;
    }

    public static Short getShort(ResultSet rs, int columnIndex) throws SQLException {
        short value = rs.getShort(columnIndex);
        if (rs.wasNull()) {
            return null;
        }
        return value;
    }

    public static Short getShort(ResultSet rs, String columnLabel) throws SQLException {
        short value = rs.getShort(columnLabel);
        if (rs.wasNull()) {
            return null;
        }
        return value;
    }

    public static Integer getInt(ResultSet rs, int columnIndex) throws SQLException {
        int value = rs.getInt(columnIndex);
        if (rs.wasNull()) {
            return null;
        }
        return value;
    }

    public static Integer getInt(ResultSet rs, String columnLabel) throws SQLException {
        int value = rs.getInt(columnLabel);
        if (rs.wasNull()) {
            return null;
        }
        return value;
    }

    public static Long getLong(ResultSet rs, int columnIndex) throws SQLException {
        long value = rs.getLong(columnIndex);
        if (rs.wasNull()) {
            return null;
        }
        return value;
    }

    public static Long getLong(ResultSet rs, String columnLabel) throws SQLException {
        long value = rs.getLong(columnLabel);
        if (rs.wasNull()) {
            return null;
        }
        return value;
    }

    public static Float getFloat(ResultSet rs, int columnIndex) throws SQLException {
        float value = rs.getFloat(columnIndex);
        if (rs.wasNull()) {
            return null;
        }
        return value;
    }

    public static Float getFloat(ResultSet rs, String columnLabel) throws SQLException {
        float value = rs.getFloat(columnLabel);
        if (rs.wasNull()) {
            return null;
        }
        return value;
    }

    public static Double getDouble(ResultSet rs, int columnIndex) throws SQLException {
        double value = rs.getDouble(columnIndex);
        if (rs.wasNull()) {
            return null;
        }
        return value;
    }

    public static Double getDouble(ResultSet rs, String columnLabel) throws SQLException {
        double value = rs.getDouble(columnLabel);
        if (rs.wasNull()) {
            return null;
        }
        return value;
    }

}
