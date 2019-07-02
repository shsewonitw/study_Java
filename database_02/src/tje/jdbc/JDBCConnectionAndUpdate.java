package tje.jdbc;

import java.sql.*;


public class JDBCConnectionAndUpdate {

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
		
		String url = "jdbc:mysql://localhost:3306/hr?serverTimezone=UTC";
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
		
		

		PreparedStatement pstmt = null;

		// Insert ������ �ۼ� ��, values �� �߰��Ǵ� ���� 
		// ? �� ��ü�Ͽ� �ս��� �Է��� �� �ֽ��ϴ�.
		String sql = "update users"+
					" set user_name = ?, age = ?, tel = ?" +
					" where user_id = ?";
		
		// Insert, Update, Delete ������ �����ϴ� ��� 
		// ���� Ÿ���� ���� ��ȯ�Ǹ�, ����� ���ڵ��� ������ ��ȯ
		// Insert : �Էµ� ���ڵ��� ���� ��ȯ
		// Update : ������ ���ڵ��� ���� ��ȯ
		// Delete : ������ ���ڵ��� ���� ��ȯ
		int recordCount = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			
			// ? �� ������ �ڸ��� ���� ����
			pstmt.setString(1,"�ƹ���0");
			pstmt.setInt(2,30);
			pstmt.setString(3,"010-1234-5676");
			pstmt.setString(4,"tje");
			
			
			// Insert, Update, Delete ������ �����ϴ� ��쿡��
			// executeUpdate �޼ҵ带 ����Ͽ� ������ �����մϴ�.
			// (������ ���� ����� ����� ���ڵ��� ������ ��ȯ�ϴ� �޼ҵ�)
			recordCount = pstmt.executeUpdate();
			
			if(recordCount == 1) 
				System.out.println("ȸ������ ���� ����");
			else
				System.out.println("ȸ�� ���� ���� ����");
			
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		try {
			if(pstmt != null)
				pstmt.close();
			if(conn != null)
				conn.close();
			System.out.println("DBMS ���� ����");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
