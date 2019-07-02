package tje.jdbc;

import java.sql.*;

// �����, �μ���, ��å, �ٹ��� ���ø��� ����ϼ���
// (�޿� ������ 7000 �̻� 15000 ������ �����)
public class JDBCConnectionAndSelectWithCondition {

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
		// java.sql.PreparedStatement Ŭ����
		// - java.sql.Connection Ŭ������ ��ü�κ��� �����Ǵ� ��ü
		// - ����� DBMS�� �������� ������ �� �ִ� Ŭ����
		// - ���ǽĿ� ���Ǵ� ������ ���� �ս��� �߰��� �� �ִ� ��������� ����
		// - Statement Ŭ������ �ٸ��� ��ü�� ���� �� �������� �����ؾ���
		PreparedStatement pstmt = null;
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
				+ " where salary between ? and ? "
				+ " and lower(first_name || ' ' || last_name) like ?";
		
		ResultSet rs = null;
		try {
			// where ���� �Ű������� �ʿ��� �������� ����Ͽ�
			// PreparedStatement Ŭ������ ��ü�� ��ȯ
			pstmt = conn.prepareStatement(sql);
			
			// ? �� ������ ������ ���� ����
			// 1��° ? ������ startSalary ������ ���� ����Ͽ� ����
			pstmt.setInt(1,startSalary);
			// 2��° ? ������ endSalary ������ ���� ����Ͽ� ����
			pstmt.setInt(2,endSalary);
			// 3��° ? ������ targetName ������ ���� ����Ͽ� ����
			// ���ڿ��� �����ϴ� ��� �յ��� ' �Ǵ� " �� �������� �ʾƵ� �ڵ� ���Ե�
			pstmt.setString(3,"%"+targetName+"%");
			
			// java.sql.Statement Ŭ������ execute xxx �޼ҵ�
			// ���ڿ� ���� �Ű������� ���޹޾� �ش� ���ڿ��� SQL��
			// DBMS�� ���ؼ� ������ ��, ������ ����� ��ȯ�޴� �޼ҵ�
			
			// PreparedStatement Ŭ������ ��ü�� ����Ͽ�
			// executeQuery �޼ҵ带 �����ϴ� ���
			// ������ ���ǵ� �������� ����ϹǷ� �Ű������� �������� �ʽ��ϴ�.
			// ������ ����� java.sql.ResultSet Ŭ���� Ÿ������ ��ȯ�մϴ�.
			rs = pstmt.executeQuery();
			
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
