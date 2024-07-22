package sec4;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int vplume);
	
	default void setMute(boolean mute) {
	
	}
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
