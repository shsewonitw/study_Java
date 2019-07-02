package tje.jdbc;

import java.sql.*;
import java.util.ArrayList;

import tje.jdbc.dao.CityDAO;
import tje.jdbc.model.City;
import tje.jdbc.util.*;

public class JDBC_Basic {

	public static void main(String[] args) {
		// 1. 드라이버 클래스 로딩
		// - JDBC 드라이버 클래스의 로딩 과정은
		//   프로그램의 진행 중, 단 한번만 실행하면 됩니다.
		/*
		String JDBCDriverClass = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(JDBCDriverClass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		*/
		// JDBCDriverLoader.init();
		
		// 2. DBMS 연결 객체 생성
		/*
		Connection conn = null;
		
		String url = "jdbc:mysql://localhost:3306/world?serverTimezone=UTC";
		String user = "root";
		String password = "SystemManager304";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		*/
		Connection conn = JDBCConnection.getConnection();
		
		
		// 3. 쿼리(SQL) 실행 객체 생성
		/*
		Statement stmt = null;
		PreparedStatement pstmt = null;
		
		String sql = "select * from city";
		
		try {
			stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		*/
		
		/*
		String sql = "select * from city";
		Statement stmt = JDBCObjectManager.getStatement(conn);
		PreparedStatement pstmt = JDBCObjectManager.getStatement(conn, sql);
		*/
		CityDAO dao = CityDAO.getInstance();
		
		
		
		
		// 4. 쿼리의 실행 및 결과 확인
		/*
		ResultSet rs = null;
		try {
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String countyCode = rs.getString(3);
				String district = rs.getString(4);
				int population = rs.getInt(5);
				
				String record = String.format("%d - %s - %s - %s - %d", id, name, countyCode, district, population);
				System.out.println(record);
			}
		} catch (SQLException e) {
			e.prinArrayList<E>ce();
		}
		*/
		ArrayList<City> result = dao.select(conn);
		for( int i = 0 ; i < result.size(); i++) {
			System.out.printf("%d, %s, %s, %s, %d\n",
					result.get(i).getId(),
					result.get(i).getName(),
					result.get(i).getCountryCode(),
					result.get(i).getDistrict(),
					result.get(i).getPopulation());
		}
		
		
		// 5. 종료 처리
		/*
		try {
			stmt.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		*/
		JDBCObjectManager.close(conn);

	}

}