package dev.alexengrig.util.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;

public class ReadOnlyResultSet extends DelegatedResultSet {

    protected ReadOnlyResultSet(ResultSet rs) {
        super(rs);
    }

    public static ResultSet wrap(ResultSet resultSet) throws SQLException {
        ResultSet unwrappedRs = unwrap(resultSet);
        return new ReadOnlyResultSet(unwrappedRs);
    }

    public static ResultSet unwrap(ResultSet resultSet) throws SQLException {
        if (resultSet.isWrapperFor(ReadOnlyResultSet.class)) {
            final ReadOnlyResultSet wrapper = resultSet.unwrap(ReadOnlyResultSet.class);
            return wrapper.delegate();
        }
        return resultSet;
    }

    private void throwUnsupportedOperationException() {
        throw new UnsupportedOperationException("Read only");
    }

    // Unsupported methods

    @Override
    public final void insertRow() {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateRow() {
        throwUnsupportedOperationException();
    }

    @Override
    public final void deleteRow() {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateNull(int columnIndex) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateBoolean(int columnIndex, boolean x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateByte(int columnIndex, byte x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateShort(int columnIndex, short x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateInt(int columnIndex, int x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateLong(int columnIndex, long x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateFloat(int columnIndex, float x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateDouble(int columnIndex, double x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateBigDecimal(int columnIndex, BigDecimal x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateString(int columnIndex, String x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateBytes(int columnIndex, byte[] x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateDate(int columnIndex, Date x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateTime(int columnIndex, Time x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateTimestamp(int columnIndex, Timestamp x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateAsciiStream(int columnIndex, InputStream x, int length) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateBinaryStream(int columnIndex, InputStream x, int length) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateCharacterStream(int columnIndex, Reader x, int length) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateObject(int columnIndex, Object x, int scaleOrLength) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateObject(int columnIndex, Object x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateNull(String columnLabel) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateBoolean(String columnLabel, boolean x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateByte(String columnLabel, byte x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateShort(String columnLabel, short x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateInt(String columnLabel, int x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateLong(String columnLabel, long x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateFloat(String columnLabel, float x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateDouble(String columnLabel, double x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateBigDecimal(String columnLabel, BigDecimal x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateString(String columnLabel, String x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateBytes(String columnLabel, byte[] x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateDate(String columnLabel, Date x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateTime(String columnLabel, Time x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateTimestamp(String columnLabel, Timestamp x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateAsciiStream(String columnLabel, InputStream x, int length) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateBinaryStream(String columnLabel, InputStream x, int length) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateCharacterStream(String columnLabel, Reader reader, int length) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateObject(String columnLabel, Object x, int scaleOrLength) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateObject(String columnLabel, Object x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateRef(int columnIndex, Ref x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateRef(String columnLabel, Ref x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateBlob(int columnIndex, Blob x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateBlob(String columnLabel, Blob x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateClob(int columnIndex, Clob x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateClob(String columnLabel, Clob x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateArray(int columnIndex, Array x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateArray(String columnLabel, Array x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateRowId(int columnIndex, RowId x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateRowId(String columnLabel, RowId x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateNString(int columnIndex, String nString) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateNString(String columnLabel, String nString) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateNClob(int columnIndex, NClob nClob) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateNClob(String columnLabel, NClob nClob) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateSQLXML(int columnIndex, SQLXML xmlObject) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateSQLXML(String columnLabel, SQLXML xmlObject) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateNCharacterStream(int columnIndex, Reader x, long length) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateNCharacterStream(String columnLabel, Reader reader, long length) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateAsciiStream(int columnIndex, InputStream x, long length) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateBinaryStream(int columnIndex, InputStream x, long length) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateCharacterStream(int columnIndex, Reader x, long length) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateAsciiStream(String columnLabel, InputStream x, long length) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateBinaryStream(String columnLabel, InputStream x, long length) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateCharacterStream(String columnLabel, Reader reader, long length) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateBlob(int columnIndex, InputStream inputStream, long length) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateBlob(String columnLabel, InputStream inputStream, long length) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateClob(int columnIndex, Reader reader, long length) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateClob(String columnLabel, Reader reader, long length) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateNClob(int columnIndex, Reader reader, long length) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateNClob(String columnLabel, Reader reader, long length) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateNCharacterStream(int columnIndex, Reader x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateNCharacterStream(String columnLabel, Reader reader) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateAsciiStream(int columnIndex, InputStream x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateBinaryStream(int columnIndex, InputStream x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateCharacterStream(int columnIndex, Reader x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateAsciiStream(String columnLabel, InputStream x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateBinaryStream(String columnLabel, InputStream x) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateCharacterStream(String columnLabel, Reader reader) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateBlob(int columnIndex, InputStream inputStream) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateBlob(String columnLabel, InputStream inputStream) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateClob(int columnIndex, Reader reader) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateClob(String columnLabel, Reader reader) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateNClob(int columnIndex, Reader reader) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateNClob(String columnLabel, Reader reader) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateObject(int columnIndex, Object x, SQLType targetSqlType, int scaleOrLength) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateObject(String columnLabel, Object x, SQLType targetSqlType, int scaleOrLength) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateObject(int columnIndex, Object x, SQLType targetSqlType) {
        throwUnsupportedOperationException();
    }

    @Override
    public final void updateObject(String columnLabel, Object x, SQLType targetSqlType) {
        throwUnsupportedOperationException();
    }

}
