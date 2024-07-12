package sec2;

public class Example {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("아이폰", "금색");
		
		System.out.println("모델: " +myPhone.model); 
		System.out.println("모델: " +myPhone.color); 
	
		System.out.println("와이파이 상태: " +myPhone.wife);
	
	myPhone.bell();
	myPhone.sendVoice("여보세요");
	myPhone.receiveVoice("안녕하세여 저는 홍길동인데요");
	myPhone.sendVoice("아~네 반갑습니다");
	myPhone.hangUP();
	
	myPhone.setwifi(true);
	myPhone.internet();
	
	
	
	}
	
}
