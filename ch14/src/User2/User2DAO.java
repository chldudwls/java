package User2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import User1.User1VO;

public class User2DAO {

	private static User2DAO instance = new User2DAO();
	public static User2DAO getInstance() {
		return instance;
	}
	
	private User2DAO() {}
	
	private final static String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	
	public void insertUser(User2VO vo) {
		String sql = "insert into `user2` values (?,?,?,?)";
		
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getUid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getBirth());
			psmt.setString(4, vo.getAddr());
			
			psmt.executeUpdate();
			
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public User2VO selecUser(String uid) {
		String sql = "select * from `user2` where `uid`=?";
		User2VO user = null;
		
		try {
		Connection conn = DriverManager.getConnection(HOST, USER, PASS);
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, uid);
		
		ResultSet rs = psmt.executeQuery();
		
		if(rs.next()) {
			
			user = new User2VO();
			user.setUid(rs.getString(1));
			user.setName(rs.getString(2));
			user.setBirth(rs.getString(3));
			user.setAddr(rs.getString(4));
		}
		
		rs.close();
		psmt.close();
		conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public List<User2VO> selectUsers() {
		
		String sql = "select *from `user2`";
		List<User2VO> users = new ArrayList<>();
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				User2VO vo = new User2VO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setBirth(rs.getString(3));
				vo.setAddr(rs.getString(4));
				
				users.add(vo);
			}
			
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}
	
	public int updateUser(User2VO vo) {
		
		String sql = "update `user2` set `name`=?,`birth`=?,`hp`=?,`age`=? where `uid`=?";
		int result = 0;
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getBirth());
			psmt.setString(3, vo.getAddr());
			psmt.setString(4, vo.getUid());
			
			psmt.executeUpdate();
			
			psmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	
	}	
	public int deleteUser(String uid) {
			String sql = "delete from `user2` where `uid`=?";
			int result = 0;
					
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, uid);
			
			result = psmt.executeUpdate();
			
			psmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
}
