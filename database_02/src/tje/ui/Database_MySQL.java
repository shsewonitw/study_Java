package tje.ui;

import java.sql.*;

public class Database_MySQL {

	public void add(String id, String pw, String name, String age, String tel,Frame frame) {

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

		String url = "jdbc:mysql://localhost:3306/hr?serverTimezone=UTC";
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

		PreparedStatement pstmt_select = null;
		PreparedStatement pstmt_insert = null;

		String sql_select = "select * from users where user_id = ?";

		String sql_insert = "insert into users values (0,?,?,?,?,?)";

		int recordCount = 0;
		ResultSet rs = null;
		try {
			pstmt_select = conn.prepareStatement(sql_select);
			pstmt_insert = conn.prepareStatement(sql_insert);

			pstmt_select.setString(1, id);
			rs = pstmt_select.executeQuery();
			if (!rs.isBeforeFirst()) {
				pstmt_insert.setString(1, id);
				pstmt_insert.setString(2, pw);
				pstmt_insert.setString(3, name);
				try {
					pstmt_insert.setInt(4, Integer.parseInt(age));
				} catch(Exception e) {
					frame.ageFailMsg();
				}
				pstmt_insert.setString(5, tel);

				recordCount = pstmt_insert.executeUpdate();
				if (recordCount != 0) {
					frame.okMsg();
					System.out.println("회원가입 성공!");
				} else {
					System.out.println("회원가입 실패!");
				}
			} else {
				frame.failMsg();
				System.out.println("이미 존재하는 아이디입니다.");
			}
		} catch (Exception e) {
		}

		try {

			if (pstmt_select != null)
				pstmt_select.close();
			if (pstmt_insert != null)
				pstmt_insert.close();
			if (rs != null)
				rs.close();
			if (conn != null)
				conn.close();
			System.out.println("DBMS 연결 종료");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
