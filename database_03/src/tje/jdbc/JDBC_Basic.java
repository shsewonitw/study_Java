package tje.jdbc;

import java.sql.*;
import java.util.ArrayList;

import tje.jdbc.dao.CityDAO;
import tje.jdbc.model.City;
import tje.jdbc.util.*;

public class JDBC_Basic {

	public static void main(String[] args) {
		// 1. ����̹� Ŭ���� �ε�
		// - JDBC ����̹� Ŭ������ �ε� ������
		//   ���α׷��� ���� ��, �� �ѹ��� �����ϸ� �˴ϴ�.
		/*
		String JDBCDriverClass = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(JDBCDriverClass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		*/
		// JDBCDriverLoader.init();
		
		// 2. DBMS ���� ��ü ����
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
		
		
		// 3. ����(SQL) ���� ��ü ����
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
		
		
		
		
		// 4. ������ ���� �� ��� Ȯ��
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
		
		
		// 5. ���� ó��
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