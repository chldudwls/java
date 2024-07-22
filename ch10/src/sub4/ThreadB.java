package sub4;

public class ThreadB extends Thread {
	private WorkObject workObject;
	
	public ThreadB(WorkObject workObject) { //공유 작업 객체를 받음
		setName("ThreadB");// 스레드 이름 변경
		this.workObject = workObject;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodA();//동기화 메서드 호출
	
	
		}
	}
}