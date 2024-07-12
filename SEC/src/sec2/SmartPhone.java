package sec2;

public class SmartPhone extends Phone{
	public boolean wife;
	
	public SmartPhone(String model,String color) {
		this.model = model;
		this.color = color;
	}
	
	public void setwifi(boolean wifi) {
		this.wife = wifi;
		System.out.println("와이파이 상태를 변경했습니다");
	}
	public void internet() {
		System.out.println("인터넷을 연결합니다");
		
	}
}
