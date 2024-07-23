package sub4;

public class ThreadA extends Thread{
	private WorkObject workObject;
	
	public ThreadA(WorkObject workObject) { // 공유작업 객체를 받음
		setName("ThreadA"); // 드레드 이름 변경
		this.workObject = workObject;
		
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodA(); // 동기화 메서드 호출
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
	
		}
		System.out.println("종료");
	}
}
