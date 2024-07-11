package Sub8;

public class Remotesamsung implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("samsung powerON");
		
		
	}

	@Override
	public void powerOff() {
		System.out.println("samsung powerOff");
		
	}

	@Override
	public void chUp() {
		System.out.println("samsung chUP");
		
	}

	@Override
	public void chDown() {
		System.out.println("samsung chDown");
		
		
	}

	@Override
	public void soundUp() {
		System.out.println("samsung soundUP");
	}

	@Override
	public void soundDown() {
		System.out.println("samsung soundDown");
	}

}
