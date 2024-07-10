package Sub5;
/*
 * 날짜 : 2024/7/10
 * 이름 : 최영진
 * 내용 : 메서드 오버라이딩 실습
 */
class AAA{
	public void method1() {
		System.out.println("AAA::method1...");
	}
	public void method2() {
		System.out.println("AAA::method2...");
	}
	public void method3() {
		System.out.println("AAA::method3...");
	}
}

class BBB extends AAA{
	@Override
	public void method2() {//오버라이드 메서드
		System.out.println("BBB::method2...");
	}
	public void method3(int a) {
		System.out.println("BBB::method3...");
	}
}

class CCC extends BBB{
	@Override
	public void method1() {
		System.out.println("CCC::method!...");
	}
	@Override
	public void method2() {
		System.out.println("CCC::method2...");
	}
	public void method3(int a, int b) {
		System.out.println("CCC::method3...");
	}
}

public class MethodOverridungTest {
	public static void main(String[] args) {
		//메서드 Method Overriding 실습
		CCC c = new CCC();
		
		c.method1();
		c.method2();
		c.method3();
		c.method3(1);
		c.method3(1, 2);
		
		// Car 클래스 메서드 재정의
		
		Sedan sonata = new Sedan("소나다 ", "흰색", 0, 2000);
		sonata.speedUp(100);
		sonata.show();
		
		Truck bongo = new Truck("봉고", "검정", 0, 1000);
		bongo.speedUp(100);
		bongo.show();
	}
}
