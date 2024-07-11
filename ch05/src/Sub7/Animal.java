package Sub7;
//추상 클래스 - 추상 메소드를 갖는 클래스, 상속을 위한 클래수, 실제 구현 x
public abstract class Animal {

	public void move() {
		System.out.println("Animal move...");
	
	}
	public abstract void hunt(); //추상 메서드 abstract 선언
	//추상 메서드 - 내용이 없는 메소드, 오버라이드를 위한 메서드
	
	
}