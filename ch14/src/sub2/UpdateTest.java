package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 *  날짜 : 2024/07/29
 *  이름 : 최영진
 *  내용 : Update 실습
 */
public class UpdateTest {
	public static void main(String[] args) {
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; // <-- 마지막 접속 데이터베이스 명
		String user = "root";
		String pass = "1234";
		
		
				
	/*String sql = "Update `user4` set";
				sql += "`hp` = 010-1234-1111";
				sql += "`age` = 25 "; 
				sql += "where `uid` = 'A101'"; 
	 */
				
				try {
					Connection conn = DriverManager.getConnection(host, user, pass);
					
					Statement stme = conn.createStatement();
					
					String sql = "Update `user4` set";
						sql += "`gender` = 'F', ";
						sql += "`addr` = '경남 양산시'"; 
						sql += " where `id` = '2'";
					
					stme.close();
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		
		System.out.println("완료");
	}
}
