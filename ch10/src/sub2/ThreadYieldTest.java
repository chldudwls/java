package sub2;
/*
 * 날짜 : 2024/07/22
 * 이름 : 최영진
 * 내용 : 스레드 상태 실습하기
 */
class Sub1Thread extends Thread {
	
	public void run() { //작업 스레드로 처리할 메서드
	for(int i = 0 ; i<1000 ; i++) {
		System.out.println( "sub1 Thread 실행" + i );

		Thread.yield(); //다른 스레드에게 실행을 양보
		}
	}
}
class Sub2Thread extends Thread {
	
	public void run() { //작업 스레드로 처리할 메서드
	for(int i = 0 ; i<1000 ; i++) {
		System.out.println( "sub2 Thread 실행" + i );
	

		}
	}
}

public class ThreadYieldTest {
	public static void main(String[] args) {
		
		Sub1Thread sub1 = new Sub1Thread();
		Sub2Thread sub2 = new Sub2Thread();
		
		sub1.start();
		sub2.start();
		
		System.out.println("main 스레드 종료...");
	}
}
