package tje.jdbc;

import java.io.*;
import java.sql.*;

// users ���̺��� �̸�, ����, ����ó�� ������ �����ϴ� ���α׷��� �ۼ��ϼ���
// ������ ���̵� �Է��ϼ���: 123
// �������� �ʴ� ���̵��Դϴ�.
// ������ ���̵� �Է��ϼ���: tje
// ������ �̸�( ������ �̸� -> '�ƹ���0' ) : ��������ǻ���п�
// ������ ����( ������ ���� -> 30 ) : 21
// ������ ����ó( ������ ����ó -> '102-11-111' ) : 010-2222-2222
// ������ �Ϸ�Ǿ����ϴ�.

public class JDBCConnectionAndUpdateWithCheck {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// 1. JDBC ����̹� Ŭ���� �ε�
		String strDriverClassName = "com.mysql.cj.jdbc.Driver";
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

		String url = "jdbc:mysql://localhost:3306/hr?serverTimezone=UTC";
		String user = "root";
		String password = "SystemManager304";

		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DBMS ���� ����");
		} catch (SQLException e) {
			System.out.println("DBMS ���� ����");
			e.printStackTrace();
			return;
		}

		PreparedStatement pstmt_update = null;
		PreparedStatement pstmt_select = null;
		// Insert ������ �ۼ� ��, values �� �߰��Ǵ� ����
		// ? �� ��ü�Ͽ� �ս��� �Է��� �� �ֽ��ϴ�.
		String sql_select = "select * from users where user_id = ?";

		String sql_update = "update users" + " set user_name = ?, age = ?, tel = ?" + " where user_id = ?";

		// Insert, Update, Delete ������ �����ϴ� ���
		// ���� Ÿ���� ���� ��ȯ�Ǹ�, ����� ���ڵ��� ������ ��ȯ
		// Insert : �Էµ� ���ڵ��� ���� ��ȯ
		// Update : ������ ���ڵ��� ���� ��ȯ
		// Delete : ������ ���ڵ��� ���� ��ȯ
		int recordCount = 0;
		ResultSet rs = null;
		try {
			pstmt_select = conn.prepareStatement(sql_select);
			pstmt_update = conn.prepareStatement(sql_update);

			while (true) {
				System.out.print("������ ���̵� �Է�: ");
				String id = in.readLine();
				pstmt_select.setString(1, id);

				rs = pstmt_select.executeQuery();

				if(!rs.isBeforeFirst()) {
					System.out.println("���������ʴ� ���̵��Դϴ�");
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
				

				System.out.print("������ �̸� (���� �̸�->" + name + ") : ");
				pstmt_update.setString(1, in.readLine());
				System.out.print("������ ���� (���� ����->" + age + ") : ");
				pstmt_update.setInt(2, Integer.parseInt(in.readLine()));
				System.out.print("������ �̸� (���� ����ó->" + tel + ") : ");
				pstmt_update.setString(3, in.readLine());
				pstmt_update.setString(4, id);

				recordCount = pstmt_update.executeUpdate();

				if (recordCount == 1)
					System.out.println("ȸ������ ���� ����");
				else {
					System.out.println("ȸ�� ���� ���� ����");
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
			System.out.println("DBMS ���� ����");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
