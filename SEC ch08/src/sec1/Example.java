package sec1;
//추상 메서드
public class Example {
	public static void main(String[] args) {
	
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
	
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(0);
		rc.turnOff();
	
	
	}
}
