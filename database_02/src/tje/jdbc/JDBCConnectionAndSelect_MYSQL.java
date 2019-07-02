package tje.jdbc;

import java.sql.*;

public class JDBCConnectionAndSelect_MYSQL {

	public static void main(String[] args) {
		// 1. JDBC ����̹� Ŭ���� �ε�
		String strDriverClassName = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(strDriverClassName);
			System.out.println("����̹� Ŭ���� �ε� �Ϸ�");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� Ŭ���� �ε� ����");
			e.printStackTrace();
			return;
		}
		
		// 2. DBMS ����
		Connection conn = null;
		
		String url = "jdbc:mysql://localhost:3306/chat?serverTimezone=UTC";
		String user = "root";
		String password = "SystemManager304";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DBMS ���� ����");
		} catch (SQLException e) {
			System.out.println("DBMS ���� ����");
			e.printStackTrace();
			return;
		}
		
		
		// ����� DBMS�� �������� ������ �� �ִ� ����
		// java.sql.Statement Ŭ����
		// - java.sql.Connection Ŭ������ ��ü�κ��� �����Ǵ� ��ü
		// - ����� DBMS�� �������� ������ �� �ִ� Ŭ����
		Statement stmt = null;
		String sql = "select * from city";
		
		ResultSet rs = null;
		try {
			// ����� DBMS�κ��� �������� ������ �� �ִ� ��ü�� ��ȯ�޴� �ڵ�
			stmt = conn.createStatement();
			
			// java.sql.Statement Ŭ������ execute xxx �޼ҵ�
			// ���ڿ� ���� �Ű������� ���޹޾� �ش� ���ڿ��� SQL��
			// DBMS�� ���ؼ� ������ ��, ������ ����� ��ȯ�޴� �޼ҵ�
			
			// executeQuery �޼ҵ�� select ���� ������ ��, 
			// ������ ����� java.sql.ResultSet Ŭ���� Ÿ������ ��ȯ�մϴ�.
			
			rs = stmt.executeQuery(sql);
			
			while( rs.next() ) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String countryCode = rs.getString(3);
				String district = rs.getString(4);
				int population = rs.getInt(5);
				String record = String.format("%d - %s - %s - %s - %d",id, name,countryCode,district,population);
				System.out.println(record);
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		try {
			if(rs != null)
				rs.close();
			if(stmt != null)
				stmt.close();
			if(conn != null)
				conn.close();
			System.out.println("DBMS ���� ����");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
