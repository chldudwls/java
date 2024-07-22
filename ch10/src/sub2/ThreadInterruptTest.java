package sub2;
/*
 * 날짜 : 2024/07/22
 * 이름 : 최영진
 * 내용 : 스레드 실습하기
 */

class SubThread extends Thread {
	public void run() { //작업 스레드로 처리할 메서드
		int i = 1;
	try {
		for(;;){
			System.out.println( "Work Thread 실행" + i );
			i++;
				Thread.sleep(1000); //스레드 1초 대기
			}
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
	}
}
public class ThreadInterruptTest {
	public static void main(String[] args) {
		
		SubThread sub = new SubThread();
		sub.start();
		try {
			Thread.sleep(1000*10); // 메인 스레드 10초 대기 (일시정지)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		sub.interrupt(); // InterruptedException 을 발생시켜서 작업 스레드 종료
		
		System.out.println("mian 스레드 종료...");
	}
}
