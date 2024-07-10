package Sub5;

public class Sedan extends Car{ //세단은 자식클래스 카 는 부보클래스
	

	private	int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);//부모클래스 생성차 호출
		this.cc = cc;
	}	
	
	@Override
		public void speedUp(int speed) {
		// sedan 에 맞게 speedUp 메서드 재정의	
		this.speed += speed * cc;
		}
	
	public void show() {
		super.show();
		System.out.println("배기량 : " + cc);

	}
}
