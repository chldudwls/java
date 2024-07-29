package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sub2.User4VO;

/*
 *  날짜 : 2024/07/29
 *  이름 : 최영진
 *  내용 : PerparedInsert 실습
 */
public class PerparedSelectTest {
	public static void main(String[] args) {
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; // <-- 마지막 접속 데이터베이스 명
		String user = "root";
		String pass = "1234";
		List<User2VO> user2s = new ArrayList<>();
		try {
			// 1단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			// 2단계 - SQL 실행 객체(PreparedStatement)
			String sql = "select *from `user2`";
			PreparedStatement ptmt = conn.prepareStatement(sql);
			
			
			// 3단계 - SQL 실행
			ResultSet rs = ptmt.executeQuery();
			// 4단계 - Resultset
			while (rs.next()) {
				
				User2VO vo = new User2VO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setBirth(rs.getString(3));
				vo.setAddr(rs.getString(4));
				
				user2s.add(vo);
			}
			// 5단계 - 데이터베이스 종료
			ptmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(User2VO vo : user2s) {
			System.out.println(vo);
		}
		System.out.println("완료");
		
	}
}
