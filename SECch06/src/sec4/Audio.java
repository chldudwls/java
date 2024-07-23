package sec4;

public class Audio implements RemoteControl{
	public int volume;
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
		
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨 : " + this.volume);
	}
	
		private int meoryvolume;
	
	public void setMute(boolean mute) {
		if(mute) {
			this.meoryvolume = this.volume;
			System.out.println("무음 처리");
			setVolume(RemoteControl.MIN_VOLUME);
		}else {
			System.out.println("무음 해제");
			setVolume(this.meoryvolume);
		}
	}

	
		

}