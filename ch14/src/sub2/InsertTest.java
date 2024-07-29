package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

/*
 *  날짜 : 2024/07/29
 *  이름 : 최영진
 *  내용 : Insert 실습
 */
public class InsertTest {
	public static void main(String[] args) {
		
		// DB 정보	
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; // <-- 마지막 접속 데이터베이스 명
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			// 2단계 - SQL실행 객체 statement 생성
			Statement stmt = conn.createStatement();
			// 3단계 - SQL 실행
			String sql = "INSERT INTO `user4` values (8, '김유', 'M',23,'010-1234-6666', '부산 진구')";
			stmt.executeUpdate(sql);
			// 4단계 - Resutset 결과처리 (selecct일 경우)
			// 5단계 - 접속 종료
			stmt.cancel();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
				
				System.out.println("insert 완료");
				
	}
}
