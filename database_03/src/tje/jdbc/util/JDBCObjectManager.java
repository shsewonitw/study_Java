package tje.jdbc.util;

import java.sql.*;

public class JDBCObjectManager {
	public static Statement getStatement(Connection conn) {
		Statement obj = null;
		
		try {
			obj = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return obj;
	}
	
	public static PreparedStatement getStatement(Connection conn, String sql) {
		PreparedStatement obj = null;
		
		try {
			obj = conn.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return obj;
	}
	
	public static void close(Connection obj) {
		if(obj == null)
			return;
		
		try {
			obj.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Statement obj) {
		if(obj == null)
			return;
		
		try {
			obj.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(PreparedStatement obj) {
		if(obj == null)
			return;
		
		try {
			obj.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet obj) {
		if(obj == null)
			return;
		
		try {
			obj.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void setAutoCommit(Connection conn, boolean flag) {
		try {
			conn.setAutoCommit(flag);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void commit(Connection conn) {
		try {
			// ��������� �������� DB�� ����
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection conn) {
		try {
			// ��������� �������� ���
			conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
