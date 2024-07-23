package sub1;
	/*
	 * 날짜 : 2024/07/23
	 * 이름 : 최영진
	 * 내용 : 람다식 실습하기
	 */

interface Person {
	public void hello();
}

class Student implements Person{
	@Override
	public void hello() {
		System.out.println("Hello Student!");
	}
}
// 람다식으로 정의할 인터페이스 선언
@FunctionalInterface
interface A{
	public int method(int A, int B);
}

@FunctionalInterface
interface B{
	public void mehhod(double a);
}

@FunctionalInterface
interface C{
	public boolean method();
}

@FunctionalInterface
interface M {
	public double func(double num);
}

public class LamddaTest {
	public static void main(String[] args) {
		
		//객체지향 프로그래밍
		Person std = new Student();
		std.hello();
		
		//함수형 프로그래밍
		Person teacher = () -> {
			System.out.println("Hello Teacher!"); 
		};
		
		teacher.hello();
	
		
		//람다식 예제
		A a1 = (int a, int b) -> {
			int c = a + b;
			return c;
		};
		//간단하게
		A a2 = (a, b) -> {
			return a + b;
		};
		//겁나가 간단하게
		A a3 = (a, b) -> a + b;
		
		int r1 = a1.method(1, 2);
		int r2 = a2.method(2, 3);
		int r3 = a3.method(3, 4);
		
		System.out.println("r1: " + r1);
		System.out.println("r2: " + r2);
		System.out.println("r3: " + r3);
		
		// B interface
		B b1 = (double a) -> {
			System.out.println("a : " + a);
		
		};
		
		B b2 = a -> System.out.println("a : " + a);
		
		B b3 = System.out::println; //메소드 참조 연산자 (::)
		
		b1.mehhod(1.0);
		b2.mehhod(2.0);
		b3.mehhod(3.0);
		
		// C interface
		C c1 = () -> { return true; };
		C c2 = () -> false;
		
		System.out.println("c1 : " + c1.method());
		System.out.println("c2 : " + c2.method());
	
		
		//람다식을 이용한 수학 클레스
		M m1 = Math::ceil;
		M m2 = Math::floor;
		M m3 = Math::round;
		
		System.out.println("올림값 : " + m1.func(1.2));
		System.out.println("내림값 : " + m2.func(1.2));
		System.out.println("반올림 : " + m3.func(1.2));
		
		
	}
}
