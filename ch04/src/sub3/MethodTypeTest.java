package sub3;
/*
 * 날짜: 2024/7/2
 * 이름: 최영진
 * 내용:java 메서드 타입 실습하기
 */
public class MethodTypeTest {
	public static void main(String[] args) {
		
	}
	
	// 타입1 - 매게변수 o, 리턴값 o
	public static double tupe1(double x) {
		double y = (x * x) * Math.PI;
		return y;
	}
	// 타입2 - 매게변수 0, 리턴값 x
	public static void tupe2(boolean status) {
		if(status) {
			System.err.println("참 입니다.");
		}else {
			System.err.println("거짓 입니다.");
		}
	}
	// 타입3 - 매게변수 x, 리턴값 0
	public static boolean tupe3() {
		int num1 =1;
		int num2 =2;
		
		if(num1> num2) {
			return true;
		}else {
			return false;
		}
	}
	// 타입4 - 매게변수 x, 리턴값 x
	public static vold type1() {
		
		double result = type1(5.0);
		System.out.println("반지름 길이가 5인 원의 넓이 : " + result);
		
	}
	
	
	

}
