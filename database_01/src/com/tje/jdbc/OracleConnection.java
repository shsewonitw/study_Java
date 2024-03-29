package com.tje.jdbc;

// Java 언어를 사용하여 데이터베이스 연결 및 작업(검색, 입력, 수정, 삭제)을 지원하는 클래스가 저장된 패키지
import java.sql.*;

public class OracleConnection {

	public static void main(String[] args) {
		// JDBC 프로그래밍의 과정
		
		// 0. JDBC에서 사용할 DBMS의 드라이버 클래스 로딩
		// - 각 데이터베이스 벤더들이 제공하는 JAVA 클래스를 메모리에 로딩하는 과정
		// - JDBC 드라이버 클래스는 각각의 데이터베이스에 접근 및 작업을 할 수 있도록 구현된 클래스
		
		String JDBCClassName = "oracle.jdbc.driver.OracleDriver";
		
		try {
			// Class.forName 메소드
			// 프로그램의 실행 중에 외부의 라이브러리 클래스를 사용할 수 있도록 메모리에 적재하는 메소드
			// JDBC 드라이버 클래스는 외부에서 제공된 클래스이므로
			// Class.forName 메소드에 의해서 메모리에 적재되어야만 
			// 사용될 수 있습니다.
			// - JDBC 드라이버 파일을 빌드패스에 등록해야만 예외가 발생하지 않습니다.
			// - JDBC 드라이버 클래스는 각 벤더사 마다 상이하며 제조사의 홈페이지를 확인해야 합니다.
			Class.forName(JDBCClassName);
			System.out.println("JDBC 드라이버 클래스 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 클래스 로딩 실패");
			return;
		}
		
		// 1. 커넥션 객체의 생성
		// java.sql.Connection 클래스
		// - 데이터베이스에 접속하여 SQL문을 실행할 수 있는 객체를 반환하는 클래스
		// - DriverManager.getConnection 메소드의 실행 결과로 객체를 반환받을 수 있습니다.
		Connection conn = null;
		
		// 데이터베이스에 접속하기 위한 정보
		// - URL
		// - 데이터베이스에 접근하기 위한 주소 및 설정 값
		// - 데이터베이스마다 URL 작성법이 상이하기 때문에 메뉴얼을 참고해야 합니다.
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		// - 계정 정보
		String id = "hr";
		String pw = "hr";
		
		try {
			// DriverManager.getConnection 메소드
			// - 데이터베이스에 접속하기 위한 정보들을 매개변수로 사용하여
			//   데이터베이스 연결 객체를 반환하는 메소드
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("JDBC 연결 성공");
		} catch (SQLException e) {
			System.out.println("JDBC 연결 실패");
			e.printStackTrace();
		}
		
		try {
			// java.sql.Connection 클래스의 close 메소드
			// JDBC 프로그래밍에서 가장 중요한 과정
			// JDBC 를 활용한 프로그램 내부에서는 각 커넥션 객체들이 네트워크 통신을 사용하여 
			// DBMS 에 접속합니다.
			// 이때 사용이 종료된 Connection 객체에 대해서 
			// close 메소드를 호출하지 않으면 메모리 누수현상이 발생할 수 있고
			// DBMS 에 의해서 접속이 차단될 수 있습니다.
			if(conn != null)
				conn.close();
			System.out.println("JDBC 종료");
		} catch (SQLException e) {
			System.out.println("JDBC 종료 실패");
		}
		
		
		// 2. 
	}

}
