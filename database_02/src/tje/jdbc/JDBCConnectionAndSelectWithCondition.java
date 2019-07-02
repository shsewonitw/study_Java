package tje.jdbc;

import java.sql.*;

// 사원명, 부서명, 직책, 근무지 도시명을 출력하세요
// (급여 정보가 7000 이상 15000 이하인 사원만)
public class JDBCConnectionAndSelectWithCondition {

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
		// java.sql.PreparedStatement 클래스
		// - java.sql.Connection 클래스의 객체로부터 생성되는 객체
		// - 연결된 DBMS에 쿼리문을 실행할 수 있는 클래스
		// - 조건식에 사용되는 임의의 값을 손쉽게 추가할 수 있는 설정기능을 제공
		// - Statement 클래스와 다르게 객체의 생성 시 쿼리문을 정의해야함
		PreparedStatement pstmt = null;
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
				+ " where salary between ? and ? "
				+ " and lower(first_name || ' ' || last_name) like ?";
		
		ResultSet rs = null;
		try {
			// where 절의 매개변수가 필요한 쿼리문을 사용하여
			// PreparedStatement 클래스의 객체를 반환
			pstmt = conn.prepareStatement(sql);
			
			// ? 로 지정된 공간에 값을 설정
			// 1번째 ? 영역에 startSalary 변수의 값을 사용하여 설정
			pstmt.setInt(1,startSalary);
			// 2번째 ? 영역에 endSalary 변수의 값을 사용하여 설정
			pstmt.setInt(2,endSalary);
			// 3번째 ? 영역에 targetName 변수의 값을 사용하여 설정
			// 문자열을 지정하는 경우 앞뒤의 ' 또는 " 를 지정하지 않아도 자동 삽입됨
			pstmt.setString(3,"%"+targetName+"%");
			
			// java.sql.Statement 클래스의 execute xxx 메소드
			// 문자열 값을 매개변수로 전달받아 해당 문자열의 SQL을
			// DBMS을 통해서 실행한 후, 실행의 결과를 반환받는 메소드
			
			// PreparedStatement 클래스의 객체를 사용하여
			// executeQuery 메소드를 실행하는 경우
			// 사전에 정의된 쿼리문을 사용하므로 매개변수를 전달하지 않습니다.
			// 실행의 결과를 java.sql.ResultSet 클래스 타입으로 반환합니다.
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
			System.out.println("DBMS 연결 종료");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
