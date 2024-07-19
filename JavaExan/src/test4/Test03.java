package test4;

import java.util.Scanner;

class LoginException extends Exception{
	public LoginException(String msg) {
		super(msg);
	}
}
public class Test03 {
	public static void main(String[] args) {
		
		String userId = "a101";
		String userPw = "abc1234";
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("아이디 : ");
			String inputId = sc.nextLine();
			
			System.out.println("비밀번호 : ");
			String inoutPw = sc.nextLine();
			
			if(!userId.equals(inputId)) {
				throw new LoginException("아이디가 올바르지 않습니다.");
				
			}else if(!userPw.equals(inoutPw)) {
				throw new LoginException("비밀번호가 올바르지 않습니다.");
			}else {
				System.out.println("로그인");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}
}
