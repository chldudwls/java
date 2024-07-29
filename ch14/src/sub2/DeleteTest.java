package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 *  날짜 : 2024/07/29
 *  이름 : 최영진
 *  내용 : Insert 실습
 */
public class DeleteTest {
	public static void main(String[] args) {
		
		//
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; // <-- 마지막 접속 데이터베이스 명
		String user = "root";
		String pass = "1234";
		
		try {
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate("DELETE FROM `user4` where `uid`='5'");
			stmt.close();
			conn.close();
		} catch (Exception e) {
				e.printStackTrace();
		}
		System.out.println("완료");
	}
}
