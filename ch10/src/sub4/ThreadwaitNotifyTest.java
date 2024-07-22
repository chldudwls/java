package sub4;
/*
 * 날짜 : 2024/07/22
 * 이름 : 최영진
 * 내용 : 스레드 제어 실습하기 교재 617-619
 */
public class ThreadwaitNotifyTest {
	public static void main(String[] args) {

		WorkObject workObject = new WorkObject(); //공유 작업 객체 생성
		
		
		
		//작업 스레드 생성 및 실행
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		threadA.start();
		threadB.start();
	}
}
