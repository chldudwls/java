package sub4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



/*
 *  날짜 : 2024/07/30
 *  이름 : 최영진
 *  내용 : Transaciont 실습
 */
public class TransactionTest {
	
	private final static String host = "jdbc:mysql://127.0.0.1:3306/bankerd";
	private final static String user = "root";
	private final static String pass = "1234";
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("에러를 발생 하시겠습니다");
		
		int answer = sc.nextInt();
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(host, user, pass);
			
			
			//트랙잭션 시작
			conn.setAutoCommit(false);
			
			String sql1 = "UPDATE `bank_account` set `a_balance` = `a_balance` - 10000 where `a_no`=?";
			String sql2 = "UPDATE `bank_account` set `a_balance` = `a_balance` + 10000 where `a_no`=?";
			
			PreparedStatement psmt1 = conn.prepareStatement(sql1);
			psmt1.setString(1, "101-11-1001");
			
			
			PreparedStatement psmt2 = conn.prepareStatement(sql2);
			psmt2.setString(1, "101-11-1002");
			
			psmt1.executeUpdate();
			if(answer == 1) {
				throw new Exception();
			}

				
			psmt2.executeUpdate();
			//트랙잭션 커밋(작업 성공처리)
			conn.commit();
			
			psmt1.cancel();
			psmt2.cancel();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO: handle exception
			}
		}
		
		System.out.println("트랜잭션 완료...");
		
		
		
		
		
	}
}
