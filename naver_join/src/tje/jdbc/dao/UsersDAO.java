package tje.jdbc.dao;


import java.sql.*;
import java.util.*;
import tje.jdbc.util.*;
import tje.jdbc.model.*;

public class UsersDAO {
	private static UsersDAO instance = new UsersDAO();
	
	public static UsersDAO getInstance() {
		return instance;
	}
	
	private UsersDAO() {};
	
	public Users select(Connection conn, Users users) {
		Users result = null;		
		String sql = "select * from users where id = ?";
		PreparedStatement stmt = JDBCObjectManager.getStatement(conn, sql);
		ResultSet rs = null;
		
		try {
			stmt.setString(1, users.getId());
			rs = stmt.executeQuery();
			
			if( rs.next() ) {				
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String birth = rs.getString(4);
				String gender = rs.getString(5);			
				String email = rs.getString(6);
				String tel = rs.getString(7);
				result = new Users(id,pw,name,birth,gender,email,tel);
			}
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		JDBCObjectManager.close(rs);
		JDBCObjectManager.close(stmt);
		
		return result;
	}
	
	public int insert(Connection conn, Users users) {
		int result = 0;		
		String sql = "insert into users values (?,?,?,?,?,?,?)";
		PreparedStatement stmt = JDBCObjectManager.getStatement(conn, sql);		
		
		try {
			stmt.setString(1, users.getId());
			stmt.setString(2, users.getPw());
			stmt.setString(3, users.getName());
			stmt.setString(4, users.getBirth());
			stmt.setString(5, users.getGender());
			
			stmt.setString(7, users.getTel());
			
			if(users.getEmail().length() > 0)
				stmt.setString(6, users.getEmail());
			else
				stmt.setNull(6, Types.NULL);
			
			result = stmt.executeUpdate();			
		} catch (SQLException e) {			
			e.printStackTrace();
		}		
		
		JDBCObjectManager.close(stmt);
		
		return result;
	}
}
