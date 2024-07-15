package sub01;

import java.lang.reflect.Constructor;


public class Exception {
	public static void main(String[] args) {
		////////////////////////////////////
		//실행예외(런타임. 프로그램 실행중 발생 예외)
		////////////////////////////////////
		// 예외상황1. 어떤 수를 0으로 나눌떄
		
		int num1 = 1;
		int num2 = 0;

		int r1 = num1 + num2;
		int r2 = num1 - num2;
		int r3 = num1 * num2;
		int r4 = 0;
		//ArithmeticException:
		try {
			//예외가 발생할 코드
			r4 = num1 / num2;
		}catch(ArithmeticException e) {
			//예외가 발생햇을 때 
			e.printStackTrace(); //예외 출력
		}
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);
		
		// 예외상황2. 배열의 인덱스 참조가 잘못되었을때
		
		int[] arr = {1, 2, 3, 4, 5}; 
		// java.lang.ArrayIndexOutOfBoundsException
		try {
		for(int i=0; i<10; i++) {
			System.out.println("arr["+i+"]" + arr[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		// 예외상황3. 객체 생성 없이 메서드 호출
		Animal ani = null;
		
		try {
			
		ani.move();
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		// 예외상황4. 잘못된 캐스팅           
		
				Animal a1 = new Tiger();
				Animal a2 = new Eagle();
				Animal a3 = new Shark();
				
				
				try {
				Tiger  tiger = (Tiger) a1;
				Shark  shark = (Shark) a2;
				
				tiger.move();
				shark.move();
				
				}catch(ClassCastException e) {
					e.printStackTrace();
				}
		
		
		
		
		
		
		////////////////////////////////////
		//일반예외(컴파일타임, 프로그램 실행전 발생 예외)
		////////////////////////////////////
	
		//동적 객체 생성
		try {
			//예외가 발생할 코드
			Class clazz = Class.forName("sub01.Eagle");
			Constructor<?> constructor = clazz.getDeclaredConstructor();
			Eagle eagle =(Eagle) constructor.newInstance();
			
		} catch (ClassNotFoundException e ) {
			//예외가 발생햇을때
		e.printStackTrace();
		}finally {
			//예외처리 발생여부와 상관없이 마지막에 항상 실행
			
			System.out.println("finally 실행...");
		}
		
		
				System.out.println("프로그램 종료...");
	}
}