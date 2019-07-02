package tje.jdbc;

import java.io.*;
import java.sql.*;

// users 테이블의 이름, 나이, 연락처의 정보를 수정하는 프로그램을 작성하세요
// 수정할 아이디를 입력하세요: 123
// 존재하지 않는 아이디입니다.
// 수정할 아이디를 입력하세요: tje
// 수정할 이름( 기존의 이름 -> '아무개0' ) : 더조은컴퓨터학원
// 수정할 나이( 기존의 나이 -> 30 ) : 21
// 수정할 연락처( 기존의 연락처 -> '102-11-111' ) : 010-2222-2222
// 수정이 완료되었습니다.

public class JDBCConnectionAndUpdateWithCheck {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

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

		PreparedStatement pstmt_update = null;
		PreparedStatement pstmt_select = null;
		// Insert 쿼리의 작성 시, values 에 추가되는 값은
		// ? 로 대체하여 손쉽게 입력할 수 있습니다.
		String sql_select = "select * from users where user_id = ?";

		String sql_update = "update users" + " set user_name = ?, age = ?, tel = ?" + " where user_id = ?";

		// Insert, Update, Delete 쿼리를 수행하는 경우
		// 정수 타입의 값이 반환되며, 적용된 레코드의 개수가 반환
		// Insert : 입력된 레코드의 개수 반환
		// Update : 수정된 레코드의 개수 반환
		// Delete : 삭제된 레코드의 개수 반환
		int recordCount = 0;
		ResultSet rs = null;
		try {
			pstmt_select = conn.prepareStatement(sql_select);
			pstmt_update = conn.prepareStatement(sql_update);

			while (true) {
				System.out.print("수정할 아이디 입력: ");
				String id = in.readLine();
				pstmt_select.setString(1, id);

				rs = pstmt_select.executeQuery();

				if(!rs.isBeforeFirst()) {
					System.out.println("존재하지않는 아이디입니다");
					continue;
				}
				
				String name = "";
				int age = 0;
				String tel = "";
				while (rs.next()) {	
					name = rs.getString(4);
					age = rs.getInt(5);
					tel = rs.getString(6);
				}
				

				System.out.print("수정할 이름 (기존 이름->" + name + ") : ");
				pstmt_update.setString(1, in.readLine());
				System.out.print("수정할 나이 (기존 나이->" + age + ") : ");
				pstmt_update.setInt(2, Integer.parseInt(in.readLine()));
				System.out.print("수정할 이름 (기존 연락처->" + tel + ") : ");
				pstmt_update.setString(3, in.readLine());
				pstmt_update.setString(4, id);

				recordCount = pstmt_update.executeUpdate();

				if (recordCount == 1)
					System.out.println("회원정보 수정 성공");
				else {
					System.out.println("회원 정보 수정 실패");
					System.out.println(recordCount);
				}

				break;

			}

		} catch (Exception e1) {
			e1.printStackTrace();
		}

		try {
			in.close();
			rs.close();
			if (pstmt_select != null)
				pstmt_select.close();
			if (pstmt_update != null)
				pstmt_update.close();
			if (conn != null)
				conn.close();
			System.out.println("DBMS 연결 종료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
