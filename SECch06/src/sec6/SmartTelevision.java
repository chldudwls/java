package sec6;

public class SmartTelevision implements RemoteControl,Serchable{

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "을 검색합니다");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("켭니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("끕니다");
	}

}
