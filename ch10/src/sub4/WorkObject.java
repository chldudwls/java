package sub4;

public class WorkObject {
	public synchronized void methodA() { //동기화 메서드
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodA 작업 실행");
		notify(); //다른 스레드를 실행 대기 상태로 전환
		try {
			wait(); // 자기 자신을 일시정지 상태로 전환
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	public synchronized void methodB() { // 동기화 메서드
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodB 작업 실행");
		notify(); // 다른 스레드를 실행 대기 상태로 만듦
		
		try {
			wait(); // 자긴의 스레드는 일시 정지 상태로 만듦
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
