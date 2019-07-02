package tje.jdbc;

import java.sql.*;

public class JDBCConnectionAndSelect {

	public static void main(String[] args) {
		// 1. JDBC ����̹� Ŭ���� �ε�
		String strDriverClassName = "oracle.jdbc.driver.OracleDriver";
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
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "hr";
		String password = "hr";
		
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
		String sql = "select * from departments";
		
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
				int department_id = rs.getInt(1);
				String department_name = rs.getString("department_name");
				int manager_id = rs.getInt(3);
				int location_id = rs.getInt("location_id");
				
				String record = String.format("%d - %s - %d - %d",department_id, department_name,manager_id,location_id);
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
