package sec3;
//정적 메서드
public class Example {
	public static void main(String[] args) {
	
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
	
		
	
		System.out.println();
		
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
	}
}
