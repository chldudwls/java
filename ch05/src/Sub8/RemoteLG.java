package Sub8;

public class RemoteLG implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("LG powerON");
		
	}

	@Override
	public void powerOff() {
		System.out.println("LG powerOff");
		
	}

	@Override
	public void chUp() {
		System.out.println("LG chUP");
	}

	@Override
	public void chDown() {
		System.out.println("LG chDown");
		
	}

	@Override
	public void soundUp() {
		System.out.println("LG soundUP");
		
	}

	@Override
	public void soundDown() {
		System.out.println("LG soundDown");
		
	}

	
	
	
}
