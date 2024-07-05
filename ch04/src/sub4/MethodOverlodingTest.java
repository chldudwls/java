package sub4;
/*
 * 날짜: 2024/7/2
 * 이름: 최영진
 * 내용: 메서드 오버로딩 실습하기
 */
public class MethodOverlodingTest {
	public static void main(String[] args) {
	//오버로드 메서드 정의
		
		int r1 = odd(3);
		int r2 = odd(1,2);
		double r3 = odd(1.0, 2.1);
		String r4 = odd("Hello", "World");
		
		public static int add(int a) {
			return a + a;
		}
		public static int add(int a, int b) {
			return a + b;
		}
		public static int add(double a, double b) {
			return a + b;
		}
			
		public static int add(String a, String b) {
			return a + b;
		}
		
	}
}

		
		
			
