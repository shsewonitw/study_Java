package tje.jdbc;

import java.sql.*;

public class JDBCConnectionAndSelect_MYSQL {

	public static void main(String[] args) {
		// 1. JDBC 드라이버 클래스 로딩
		String strDriverClassName = "com.mysql.cj.jdbc.Driver";
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
		
		String url = "jdbc:mysql://localhost:3306/chat?serverTimezone=UTC";
		String user = "root";
		String password = "SystemManager304";
		
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
		String sql = "select * from city";
		
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
			System.out.println("DBMS 연결 종료");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
