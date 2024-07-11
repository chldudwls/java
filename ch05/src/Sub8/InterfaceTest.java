package Sub8;
/*
 * 날짜: 2024/7/11
 * 이름: 최영진
 * 내용: 인터페이스 실습
 * 
 * 인터페이스
 * 		- 표준화된 클래스 설계에 사용되는 구조체
 * 		- 인터페이스를 활용해서 다형성을 구현하고 객체간 결합도를 완화
 * 		- 다중상속효과
 * 
 */
class Computer {
	public void boot(){
		System.out.println("부팅...");
	}
}

interface Internet{
	public void access();
}
class Tv extends Computer implements Internet {
	public void show() {
		System.out.println("Tv 시청....");
	}

	@Override
	public void access() {
		System.out.println("인터넷 접속...");
		
	}
}






public class InterfaceTest {
	public static void main(String[] args) {
		
		// 인터페이스 실습1 - 표준화된 클래스 설꼐
		RemoteControl lg = new RemoteLG();
		lg.powerOn();
		lg.chUp();
		lg.soundUp();
		lg.soundDown();
		
		RemoteControl samsung = new Remotesamsung();
		samsung.powerOn();
		samsung.chUp();
		samsung.soundUp();
		samsung.soundDown();
		// 인터페이스 실습2 - 다형성 예제
		
		
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switcgOn();
		socket.switcgOff();
		
		
		
		// 인터페이스 실습3 - 디증 상속 효과 예제
		
		
		Tv tv = new Tv();
		tv.boot();
		tv.access();
		tv.show();
		
	}
	
	
	
	
}
