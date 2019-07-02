package tje.jdbc;

import java.sql.*;

import tje.jdbc.util.*;
import tje.jdbc.dao.*;
import tje.jdbc.model.*;

public class JDBC_Chat {
	public static void main(String[] args) {
		// chat 데이터베이스의 연결 객체를 반환
		Connection conn = JDBCConnection.getConnection();
		
		// chat 데이터베이스의 User 테이블에 대한 
		// JDBC 작업을 제공하는 DAO 클래스
		MemberDAO dao = MemberDAO.getInstance();
		
		/*
		// 1. 입력 (모델 객체를 활용)
		User user1 = new User("abc", "123", "tje1", "tje1", "010-1111-1111");
		dao.insert(conn, user1);
		User user2 = new User("def", "456", "tje2", "tje2", "010-2222-2222");
		dao.insert(conn, user2);
		*/
		
		/*
		// 2. 수정
		User user3 = new User("abc", "1234567890");
		dao.update(conn, user3);
		*/		
		
		/*
		// 3. 검색
		User user4 = dao.select(conn, new User("def"));
		System.out.println(user4);
		*/
				
		/*
		// 4. 삭제
		User user5 = new User("def");
		dao.delete(conn, user5);
		*/
		
		// 5. 다수개의 컬럼 값을 수정
		// 1234567890	tje1	tje1	010-1111-1111
		User user = new User("abc", "1234567890", "더조은컴퓨터학원", "더조은", "01-11-1111");
		
		// Connection 클래스 객체의 setAutoCommit 메소드는
		// 자동 커밋을 지정/해제 할 수 있는 메소드 입니다.
		// 매개변수를 false로 지정하는 경우
		// 쿼리의 작업 이 후, commit 또는 rollback 메소드를 호출하여 
		// 쿼리의 결과를 저장 또는 취소 할 수 있습니다.
		// (예외처리는 별도의 util 클래스를 사용하여 처리)
		JDBCObjectManager.setAutoCommit(conn, false);
		
		int recordCount = 0;
		
		recordCount += dao.updatePassword(conn, user);
		recordCount += dao.updateName(conn, user);
		recordCount += dao.updateAlias(conn, user);
		recordCount += dao.updateTel(conn, user);
		
		if(recordCount == 4)
			// 모든 업데이트 쿼리가 정상적으로 실행되는 경우
			// commit 매소드를 호출하여 DB에 저장
			JDBCObjectManager.commit(conn);
		else
			// 업데이트 쿼리중 하나라도 문제가 발생한 경우
			// rollback 매소드를 호출하여 현재까지의 모든 작업을 일괄 취소
			JDBCObjectManager.rollback(conn);
		
		JDBCObjectManager.close(conn);
	}
}