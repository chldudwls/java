package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 *  날짜 : 2024/07/29
 *  이름 : 최영진
 *  내용 : Select 실습
 */
public class SelectTest {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; // <-- 마지막 접속 데이터베이스 명
		String user = "root";
		String pass = "1234";
		//결과처리 리스트 생성
		List<User4VO> user4s = new ArrayList<>();
		
		try {
			// 1단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 2단계 - SQL실행 객체 생성
			Statement stmt = conn.createStatement();
			// 3단계 - SQL 실행
			String sql = "select *from `user4`";
			ResultSet rs = stmt.executeQuery(sql); // select문은 executeQuery문으로 실행
			// 4단계 - Resutset 결과척리
			while(rs.next()) {
				String uid = rs.getString(1);
				String name = rs.getString(2);
				String gender = rs.getString(3);		
				int age = rs.getInt(4);
				String hp = rs.getString(5);
				String addr = rs.getString(6);
				
				//System.out.println(uid+ "," + name + "," + gender +"," + age +"," + hp +","+addr);
			
			//리스트 생성
			
				User4VO vo = new User4VO();
				vo.setUid(uid);
				vo.setName(name);
				vo.setGender(gender);
				vo.setAge(age);
				vo.setHp(hp);
				vo.setAddr(addr);
				
				user4s.add(vo);
			
			}
			// 단계 - 접속종료
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//리스트 출력
		for(User4VO vo : user4s) {
			System.out.println(vo);
		}
		System.out.println("완료");
	}
	
	
}
