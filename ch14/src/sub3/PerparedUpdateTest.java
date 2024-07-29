package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 *  날짜 : 2024/07/29
 *  이름 : 최영진
 *  내용 : PerparedInsert 실습
 */
public class PerparedUpdateTest {
	public static void main(String[] args) {
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; // <-- 마지막 접속 데이터베이스 명
		String user = "root";
		String pass = "1234";
		
		// id j101 '김철수', '바산광역시'
		try {
			// 1단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 1단계 - SQL 실행 객체(PreparedStatement)
			String sql = "UPDATE `user2` SET `name`=?, `addr`=? WHERE `uid`=?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "김철수" );
			psmt.setString(2, "부산광역시" );
			psmt.setString(3, "J101");
			
			// 1단계 - SQL 실행
			psmt.executeUpdate();
			
			// 1단계 - Resultset
			// 1단계 - 데이터베이스 종료
			psmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("완료");
	}
}
