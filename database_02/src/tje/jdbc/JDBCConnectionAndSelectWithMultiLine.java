package tje.jdbc;

import java.sql.*;

// �����, �μ���, ��å, �ٹ��� ���ø��� ����ϼ���
// (�޿� ������ 7000 �̻� 15000 ������ �����)
public class JDBCConnectionAndSelectWithMultiLine {

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
		// �����, �μ���, ��å, �ٹ��� ���ø��� ����ϼ���
		// (�޿� ������ 7000 �̻� 15000 ������ �����)
		int startSalary = 10000;
		int endSalary = 20000;
		String targetName = "a";
		// ���� �������� ������ SQL ���� �ۼ��ϴ� ���
		// ���鹮���� ����� ���Ͽ� ���������� ������ �߻��� �� �ֽ��ϴ�.
		// �̷��� ������ �� �������� ���ۺκп� ������ ���Ƿ� �߰��Ͽ� �ذ��� �� �ֽ��ϴ�.
		String sql = "select first_name || ' ' || last_name, department_name, job_title, city, salary "
				+ " from employees inner join departments using (department_id) "
				+ " inner join jobs using (job_id) "
				+ " inner join locations using (location_id) "
				+ " where salary between "+startSalary+" and " +endSalary
				+ " and lower(first_name || ' ' || last_name) like '%"+targetName+"%'";
		
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
				String name = rs.getString(1);
				String department_name = rs.getString(2);
				String job_title = rs.getString(3);
				String city = rs.getString(4);
				int salary = rs.getInt(5);
				String record = String.format("%s - %s - %s - %s - %d",name, department_name,job_title,city,salary);
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
