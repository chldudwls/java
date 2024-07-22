package sub2;
/*
 * 날짜 : 2024/07/22
 * 이름 : 최영진
 * 내용 : 스레드 상태 실습하기 
 */

class WorkThread extends Thread {
	public void run() { //작업 스레드로 처리할 메서드
	for(int i = 0 ; i<10 ; i++) {
		System.out.println( "Work Thread 실행" );
		try {
			Thread.sleep(1000); //스레드 1초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	System.out.println("Sub Thread 종료... ");
	}
}

public class ThreadJoinTest {
	public static void main(String[] args) {
		
		WorkThread work = new WorkThread();
		work.start();
	
		try {
			//작업 스레드 대기
			work.join(); // 자식 스레드에서 작업이 끝나면 다시 합쳐지는 작업
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		System.out.println("main Thread 종료...");//프로그렘 종료
	}
}
