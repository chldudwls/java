package test4;

import java.util.Scanner;

public class pub {
public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("아이디 입력");
		String userId = sc.nextLine();
			System.out.println("비밀번호 입력");
		String userPw = sc.nextLine();
		
		try {
			
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


