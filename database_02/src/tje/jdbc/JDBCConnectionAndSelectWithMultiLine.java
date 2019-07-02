package tje.jdbc;

import java.sql.*;

// 사원명, 부서명, 직책, 근무지 도시명을 출력하세요
// (급여 정보가 7000 이상 15000 이하인 사원만)
public class JDBCConnectionAndSelectWithMultiLine {

	public static void main(String[] args) {
		// 1. JDBC 드라이버 클래스 로딩
		String strDriverClassName = "oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(strDriverClassName);
			System.out.println("드라이버 클래스 로딩 완료");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 클래스 로딩 실패");
			e.printStackTrace();
			return;
		}
		
		// 2. DBMS 연결
		Connection conn = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "hr";
		String password = "hr";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DBMS 연결 성공");
		} catch (SQLException e) {
			System.out.println("DBMS 연결 실패");
			e.printStackTrace();
			return;
		}
		
		
		// 연결된 DBMS에 쿼리문을 실행할 수 있는 영역
		// java.sql.Statement 클래스
		// - java.sql.Connection 클래스의 객체로부터 생성되는 객체
		// - 연결된 DBMS에 쿼리문을 실행할 수 있는 클래스
		Statement stmt = null;
		// 사원명, 부서명, 직책, 근무지 도시명을 출력하세요
		// (급여 정보가 7000 이상 15000 이하인 사원만)
		int startSalary = 10000;
		int endSalary = 20000;
		String targetName = "a";
		// 여러 라인으로 구성된 SQL 문을 작성하는 경우
		// 공백문자의 부재로 인하여 쿼리문에서 에러가 발생할 수 있습니다.
		// 이러한 문제는 각 쿼리문의 시작부분에 공백을 임의로 추가하여 해결할 수 있습니다.
		String sql = "select first_name || ' ' || last_name, department_name, job_title, city, salary "
				+ " from employees inner join departments using (department_id) "
				+ " inner join jobs using (job_id) "
				+ " inner join locations using (location_id) "
				+ " where salary between "+startSalary+" and " +endSalary
				+ " and lower(first_name || ' ' || last_name) like '%"+targetName+"%'";
		
		ResultSet rs = null;
		try {
			// 연결된 DBMS로부터 쿼리문을 실행할 수 있는 객체를 반환받는 코드
			stmt = conn.createStatement();
			
			// java.sql.Statement 클래스의 execute xxx 메소드
			// 문자열 값을 매개변수로 전달받아 해당 문자열의 SQL을
			// DBMS을 통해서 실행한 후, 실행의 결과를 반환받는 메소드
			
			// executeQuery 메소드는 select 절을 실행한 후, 
			// 실행의 결과를 java.sql.ResultSet 클래스 타입으로 반환합니다.
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
			System.out.println("DBMS 연결 종료");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
