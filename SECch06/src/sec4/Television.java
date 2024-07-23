package sec4;

public class Television implements RemoteControl{
	public int volume;
	@Override
	public void turnOn() {
		
		System.out.println("TV를 켭니다");
		
	}
	@Override
	public void turnOff() {
		
		System.out.println("TV를 끕니다");
		
	}

	
	@Override
	public void setVolume(int vplume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
	System.out.println("현재 볼륨 : " + this.volume);
	
		
	}
	
	

}
