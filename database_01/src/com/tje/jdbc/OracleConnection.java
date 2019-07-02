package com.tje.jdbc;

// Java �� ����Ͽ� �����ͺ��̽� ���� �� �۾�(�˻�, �Է�, ����, ����)�� �����ϴ� Ŭ������ ����� ��Ű��
import java.sql.*;

public class OracleConnection {

	public static void main(String[] args) {
		// JDBC ���α׷����� ����
		
		// 0. JDBC���� ����� DBMS�� ����̹� Ŭ���� �ε�
		// - �� �����ͺ��̽� �������� �����ϴ� JAVA Ŭ������ �޸𸮿� �ε��ϴ� ����
		// - JDBC ����̹� Ŭ������ ������ �����ͺ��̽��� ���� �� �۾��� �� �� �ֵ��� ������ Ŭ����
		
		String JDBCClassName = "oracle.jdbc.driver.OracleDriver";
		
		try {
			// Class.forName �޼ҵ�
			// ���α׷��� ���� �߿� �ܺ��� ���̺귯�� Ŭ������ ����� �� �ֵ��� �޸𸮿� �����ϴ� �޼ҵ�
			// JDBC ����̹� Ŭ������ �ܺο��� ������ Ŭ�����̹Ƿ�
			// Class.forName �޼ҵ忡 ���ؼ� �޸𸮿� ����Ǿ�߸� 
			// ���� �� �ֽ��ϴ�.
			// - JDBC ����̹� ������ �����н��� ����ؾ߸� ���ܰ� �߻����� �ʽ��ϴ�.
			// - JDBC ����̹� Ŭ������ �� ������ ���� �����ϸ� �������� Ȩ�������� Ȯ���ؾ� �մϴ�.
			Class.forName(JDBCClassName);
			System.out.println("JDBC ����̹� Ŭ���� �ε� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹� Ŭ���� �ε� ����");
			return;
		}
		
		// 1. Ŀ�ؼ� ��ü�� ����
		// java.sql.Connection Ŭ����
		// - �����ͺ��̽��� �����Ͽ� SQL���� ������ �� �ִ� ��ü�� ��ȯ�ϴ� Ŭ����
		// - DriverManager.getConnection �޼ҵ��� ���� ����� ��ü�� ��ȯ���� �� �ֽ��ϴ�.
		Connection conn = null;
		
		// �����ͺ��̽��� �����ϱ� ���� ����
		// - URL
		// - �����ͺ��̽��� �����ϱ� ���� �ּ� �� ���� ��
		// - �����ͺ��̽����� URL �ۼ����� �����ϱ� ������ �޴����� �����ؾ� �մϴ�.
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		// - ���� ����
		String id = "hr";
		String pw = "hr";
		
		try {
			// DriverManager.getConnection �޼ҵ�
			// - �����ͺ��̽��� �����ϱ� ���� �������� �Ű������� ����Ͽ�
			//   �����ͺ��̽� ���� ��ü�� ��ȯ�ϴ� �޼ҵ�
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("JDBC ���� ����");
		} catch (SQLException e) {
			System.out.println("JDBC ���� ����");
			e.printStackTrace();
		}
		
		try {
			// java.sql.Connection Ŭ������ close �޼ҵ�
			// JDBC ���α׷��ֿ��� ���� �߿��� ����
			// JDBC �� Ȱ���� ���α׷� ���ο����� �� Ŀ�ؼ� ��ü���� ��Ʈ��ũ ����� ����Ͽ� 
			// DBMS �� �����մϴ�.
			// �̶� ����� ����� Connection ��ü�� ���ؼ� 
			// close �޼ҵ带 ȣ������ ������ �޸� ���������� �߻��� �� �ְ�
			// DBMS �� ���ؼ� ������ ���ܵ� �� �ֽ��ϴ�.
			if(conn != null)
				conn.close();
			System.out.println("JDBC ����");
		} catch (SQLException e) {
			System.out.println("JDBC ���� ����");
		}
		
		
		// 2. 
	}

}
