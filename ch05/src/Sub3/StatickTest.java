package Sub3;
	/*
	 * 날짜: 20204/7/9
	 * 이름: 최영진
	 * 내용: 클래스 변수. 메서드 실습하기
	 * 
	 * 클래스 변수, 메서드(정적변수, 메서드)
	 * static 선언한 변수, method area에 생성
	 * 별도의 객체 생성없이 클레스 타입으로 바로 참조
	 * 객체간의 데이터 공유 목적으로 클레스변수. 메서드 사용
	 * 
	 * 싱글톤 객체(singleton)
	 * - 클레스 변수, 메서드를 활용한 객체 생성 방법
	 * - 싱글톤 객체는 오직 하나의 인스턴스로 메모리(method area)상에 생성
	 * - 싱글톤 객체를 사용해서 메모리 절약과 성능 향상
	 * 
	 * 
	 */

	class Increment{
		private int num1;
		private static int num2; //스테틱 변수라 따로 관리가된다.
		
		public Increment() {
			num1++;
			num2++;
			
			System.out.println("num1 : " + num1);
			System.out.println("num2 : " + num2);
		}
	}
public class StatickTest {
		public static void main(String[] args) {
	

	
	Increment inc1 = new Increment();
	Increment inc2 = new Increment();
	Increment inc3 = new Increment();
	
	
	



//Car실습

	Car sonata = new Car("소나타","흰색",0);
	Car avante = new Car("아반테","검정",0);

	System.out.println("전체 차량 수 :" + Car.getTotalCount());
	sonata.show();
	avante.show();
	
	//싱글톤 객체
	Calc c1 = Calc.getInstance();
	int r1 = c1.plus(1, 2);
	int r2 = c1.minus(1, 2);
	int r3 = c1.multi(3, 2);
	int r4 = c1.div(4, 2);
	
	System.out.println("r1 : " + r1);
	System.out.println("r2 : " + r2);
	System.out.println("r3 : " + r3);
	System.out.println("r4 : " + r4);
	
	}
	}
	


	
	
	
	