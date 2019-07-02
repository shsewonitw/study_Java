package tje.jdbc.dao;

import java.sql.*;
import java.util.*;
import tje.jdbc.util.*;
import tje.jdbc.model.*;

public class MemberDAO {
	private static MemberDAO instance = new MemberDAO();

	public static MemberDAO getInstance() {
		return instance;
	}

	private MemberDAO() {
	}
	
	private User generateObject(ResultSet rs) throws SQLException {
		String id = rs.getString(1);
		String password = rs.getString(2);
		String name = rs.getString(3);
		String alias = rs.getString(4);
		String tel = rs.getString(5);
		return new User(id, password, name, alias, tel);
	}

	// 전체 User의 목록을 조회할 수 있는 select
	public ArrayList<User> select(Connection conn) {
		ArrayList<User> result = new ArrayList<>();		
		String sql = "select * from user";
		Statement stmt = JDBCObjectManager.getStatement(conn);
		ResultSet rs = null;
		
		try {
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {				
				User user = generateObject(rs);
				result.add(user);
			}			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		JDBCObjectManager.close(rs);
		JDBCObjectManager.close(stmt);
		
		return result;
	}
	
	// 특정 User의 정보를 조회할 수 있는 select
	public User select(Connection conn, User user) {
		User result = null;		
		String sql = "select * from user where id = ?";
		PreparedStatement stmt = JDBCObjectManager.getStatement(conn, sql);
		ResultSet rs = null;
		
		try {
			stmt.setString(1, user.getId());
			rs = stmt.executeQuery();
			
			if( rs.next() ) {				
				result = generateObject(rs);				
			}			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		JDBCObjectManager.close(rs);
		JDBCObjectManager.close(stmt);
		
		return result;
	}

	public int insert(Connection conn, User user) {
		int result = 0;		
		String sql = "insert into user values (?,?,?,?,?)";
		PreparedStatement stmt = JDBCObjectManager.getStatement(conn, sql);		
		
		try {
			stmt.setString(1, user.getId());
			stmt.setString(2, user.getPassword());
			stmt.setString(3, user.getName());
			stmt.setString(4, user.getAlias());
			
			if(user.getTel().length() > 0)
				stmt.setString(5, user.getTel());
			else
				stmt.setNull(5, Types.NULL);
			
			result = stmt.executeUpdate();			
		} catch (SQLException e) {			
			e.printStackTrace();
		}		
		
		JDBCObjectManager.close(stmt);
		
		return result;
	}
	

	public int updatePassword(Connection conn, User user) {
		int result = 0;		
		String sql = "update user set password = ? where id = ?";
		PreparedStatement stmt = JDBCObjectManager.getStatement(conn, sql);		
		
		try {
			stmt.setString(1, user.getPassword());
			stmt.setString(2, user.getId());
			
			result = stmt.executeUpdate();			
		} catch (SQLException e) {			
			e.printStackTrace();
		}		
		
		JDBCObjectManager.close(stmt);
		
		return result;
	}
	
	public int updateName(Connection conn, User user) {
		int result = 0;		
		String sql = "update user set name = ? where id = ?";
		PreparedStatement stmt = JDBCObjectManager.getStatement(conn, sql);		
		
		try {
			stmt.setString(1, user.getName());
			stmt.setString(2, user.getId());
			
			result = stmt.executeUpdate();			
		} catch (SQLException e) {			
			e.printStackTrace();
		}		
		
		JDBCObjectManager.close(stmt);
		
		return result;
	}
	
	public int updateAlias(Connection conn, User user) {
		int result = 0;		
		String sql = "update user set alias = ? where id = ?";
		PreparedStatement stmt = JDBCObjectManager.getStatement(conn, sql);		
		
		try {
			stmt.setString(1, user.getAlias());
			stmt.setString(2, user.getId());
			
			result = stmt.executeUpdate();			
		} catch (SQLException e) {			
			e.printStackTrace();
		}		
		
		JDBCObjectManager.close(stmt);
		
		return result;
	}
	
	public int updateTel(Connection conn, User user) {
		int result = 0;		
		String sql = "update user set tel = ? where id = ?";
		PreparedStatement stmt = JDBCObjectManager.getStatement(conn, sql);		
		
		try {
			stmt.setString(1, user.getTel());
			stmt.setString(2, user.getId());
			
			result = stmt.executeUpdate();			
		} catch (SQLException e) {			
			e.printStackTrace();
		}		
		
		JDBCObjectManager.close(stmt);
		
		return result;
	}

	public int delete(Connection conn, User user) {
		int result = 0;		
		String sql = "delete from user where id = ?";
		PreparedStatement stmt = JDBCObjectManager.getStatement(conn, sql);		
		
		try {
			stmt.setString(1, user.getId());			
			
			result = stmt.executeUpdate();			
		} catch (SQLException e) {			
			e.printStackTrace();
		}		
		
		JDBCObjectManager.close(stmt);
		
		return result;
	}
}









