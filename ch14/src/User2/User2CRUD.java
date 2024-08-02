package User2;

import java.util.List;
import java.util.Scanner;

public class User2CRUD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------");
		System.out.println("회원관메니져 v1.0");
		System.out.println("---------------");
		
	while(true) {
		System.out.println("종료:0| 입력:1| 조회:2| 검색:3| 수정:4| 삭제:5");
		System.out.println("선택>");
	
		int answer = sc.nextInt();
		
		if(answer == 0) {
			break;
		}else if(answer == 1){
			System.out.println("아이디 입력: ");
			String uid = sc.next();
			System.out.println("이름 입력: ");
			String name = sc.next();
			System.out.println("생년월일 입력: ");
			String birth = sc.next();
			System.out.println("주소 입력: ");
			String addr = sc.next();
			
			User2VO vo = new User2VO(uid, name, birth, addr);
			
			User2DAO dao = User2DAO.getInstance();
			dao.insertUser(vo);
			System.out.println("입력완료");
		}else if(answer == 2){
			
			User2DAO dao = User2DAO.getInstance();
			List<User2VO> users = dao.selectUsers();
			
			for(User2VO user : users) {
				System.out.println(user);
			}
			
		}else if(answer == 3){
			System.out.println("검색 아이디:");
			String searchUid = sc.next();
			
			User2DAO dao = User2DAO.getInstance();
			User2VO user = dao.selecUser(searchUid);
			
			System.out.println(user);
		}else if(answer == 4){
			User2VO user = new User2VO();
			System.out.println("수정 회원 아이디 입력: ");
			String uid =sc.next();
			System.out.println("수정 회원 이름 입력: ");
			String name =sc.next();
			System.out.println("수정 회원 생일 입력: ");
			String birth =sc.next();
			System.out.println("수정 회원 주소 입력: ");
			String addr =sc.next();
			
			int result = User2DAO.getInstance().updateUser(user);
			if(result > 0) {
				System.out.println("수정완료");
			}else {
				System.out.println("수정 할 회원 아이디가 없습니다.");
			}
			
		}else if(answer == 5){
		
		System.out.println("삭제 회원 아이디 입력:");
		String uid = sc.next();
		
		int result = User2DAO.getInstance().deleteUser(uid);
		if(result > 0) {
			System.out.println("삭제완료");
		}else {
			System.out.println("삭제 할 회원 아이디가 없습니다.");
		}
			
			
			
		}
	
	
	
	}
	}
}
