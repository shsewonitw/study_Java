package tje.jdbc;

import java.io.*;
import java.sql.*;

// ����ڿ��� ȸ�� ������ �Է¹޾� users ���̺� ���ڵ带
// �߰��ϴ� ���α׷��� �ۼ��ϼ���.

public class JDBCConnectionAndInsertWithInput {
	public static void main(String[] args) {	
		// Ű���� �Է��� ó���ϱ� ���� ��Ʈ�� ����
		BufferedReader in = 
				new BufferedReader(
					new InputStreamReader(System.in));
		
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
		// ? �� ��ü�Ͽ� �ս��� ���� �Է��� �� �ֽ��ϴ�.
		String sql = "insert into users values (0, ?, ?, ?, ?, ?)"; 

		// Insert, Update, Delete ������ �����ϴ� ���
		// ���� Ÿ���� ���� ��ȯ�Ǹ�, ����� ���ڵ��� ������ ��ȯ
		// Insert : �Էµ� ���ڵ��� ������ ��ȯ
		// Update : ������ ���ڵ��� ������ ��ȯ
		// Delete : ������ ���ڵ��� ������ ��ȯ
		int recordCount = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);		
			
			// ? �� ������ �ڸ��� ���� ����
			System.out.print("ID�� �Է��ϼ��� : ");			
			pstmt.setString(1, in.readLine());
			System.out.print("PW�� �Է��ϼ��� : ");			
			pstmt.setString(2, in.readLine());
			System.out.print("�̸��� �Է��ϼ��� : ");			
			pstmt.setString(3, in.readLine());
			System.out.print("���̸� �Է��ϼ��� : ");			
			pstmt.setInt(4, Integer.parseInt(in.readLine()));
			System.out.print("����ó�� �Է��ϼ��� : ");			
			pstmt.setString(5, in.readLine());		
						
			// Insert, Update, Delete ������ �����ϴ� ��쿡��
			// executeUpdate �޼ҵ带 ����Ͽ� ������ �����մϴ�.
			// (������ ���� ����� ����� ���ڵ��� ������ ��ȯ�ϴ� �޼ҵ�)
			recordCount = pstmt.executeUpdate();
			
			if( recordCount == 1 )
				System.out.println("ȸ�� ���� �߰� ����!");
			else
				System.out.println("ȸ�� ���� �߰� ����!");
		} catch (Exception e1) {			
			e1.printStackTrace();
		}
		
		try {	
			in.close();
			if( pstmt != null )
				pstmt.close();
			
			if( conn != null )
				conn.close();
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
}


























