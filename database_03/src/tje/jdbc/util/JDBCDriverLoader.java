package tje.jdbc.util;

public class JDBCDriverLoader {
	public static void init() {
		try {
			Class.forName(JDBCConstraints.JDBC_DRIVER);
			System.out.println("JDBC ����̹� Ŭ���� �ε� �Ϸ�");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
