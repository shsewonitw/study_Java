package tje.jdbc.dao;

import java.sql.*;
import java.util.*;
import java.util.Date;

import tje.jdbc.model.*;
import tje.jdbc.util.*;


public class NoticeDAO {
	private static NoticeDAO instance = new NoticeDAO();
	
	public static NoticeDAO getInstance() {
		return instance;
	}
	
	private NoticeDAO() {}
	
	

	private Notice generateObject(ResultSet rs) throws SQLException {
		int id = rs.getInt(1);
		String msg = rs.getString(2);
		Date date = rs.getTimestamp(3);
		return new Notice(id, msg, date);
	}

	// select 쿼리의 결과로 지정된 개수만큼만 검색
	public ArrayList<Notice> select(Connection conn) {
		ArrayList<Notice> result = new ArrayList<>();		
		String sql = "select * from notice order by date desc limit 10";
		
		// 11번째 레코드부터 10개를 검색하는 쿼리
		// 인덱스의 시작은 0
		// String sql = "select * from notice order by date desc limit 10, 10";
		Statement stmt = JDBCObjectManager.getStatement(conn);
		ResultSet rs = null;
		
		try {
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {				
				Notice model = generateObject(rs);
				result.add(model);
			}			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		JDBCObjectManager.close(rs);
		JDBCObjectManager.close(stmt);
		
		return result;
	}
	
	

	public int insert(Connection conn, Notice model) {
		int result = 0;		
		String sql = "insert into notice values (?,?,now())";
		PreparedStatement stmt = JDBCObjectManager.getStatement(conn, sql);		
		
		try {
			stmt.setInt(1, model.getId());
			stmt.setString(2, model.getMsg());
			
			
			result = stmt.executeUpdate();			
		} catch (SQLException e) {			
			e.printStackTrace();
		}		
		
		JDBCObjectManager.close(stmt);
		
		return result;
	}
	
}
