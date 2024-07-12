package sec01;

public class Television implements RemoreControl{
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
	public void setVolume(int volume) {
		if(volume>RemoreControl.MAX_VOLUME){
		this.volume = RemoreControl.MAX_VOLUME;
		}else if(volume>RemoreControl.MIN_VOLUME){
		this.volume = RemoreControl.MAX_VOLUME;
		}else {
			this.volume = volume;
		}
	}
	 							   
}
