package sub3;
/*
 * 날짜: 2024/6/28
 * 이름: 최영진
 * 내용: 연산자 실습하기 //연산은 오른쪽에서 왼쪽으로
 * 
 */

public class OperatorTest {
	public static void main(String[] args) {
		
		// 산술연산자
		int a1 = 1;
		int a2 = 2;
		int a3 = 3;
		int a4 = 4;
		
		int result1 = a1 + a2;
		int result2 = a1 - a2;
		int result3 = a2 * a3;
		int result4 = a4 / a2;
		int result5 = a4 % a3; //나머지를 구하는 연산자
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);
		
		// 증강연산자
		int num = 0;
		num++; //1 증강 --면 1감소
		++num; //1 증강
		System.out.println("num : " + num);
		System.out.println("num : " + num);
		// 벅힙얀산자
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		
		n1 += 1; // n1 = n1 + 1
		n2 -= 2; // n2 = n2 - 2
		n3 *= 3; // n3 = n3 * 3
		n4 /= 4; // n4 = n4 / 4
		
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println("n3 : " + n3);
		System.out.println("n4 : " + n4);
				
		// 비교연산자
		int var1 = 1;
		int var2 = 2;
		
		boolean rs1 = var1 > var2; // var1이 var2보다 크다.
		boolean rs2 = var1 < var2; // var1이 var2보다 작다.
		boolean rs3 = var1 >= var2; // " 크거나 같다
		boolean rs4 = var1 <= var2; // " 작거나 같다
		boolean rs5 = var1 == var2; // " 와 같다
		boolean rs6 = var1 != var2; // " 다르다
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
		System.out.println("rs4 : " + rs4);
		System.out.println("rs5 : " + rs5);
		System.out.println("rs6 : " + rs6);
		
		// 논리연산자
		int var3 = 3;
		int var4 = 4;
		
		boolean res1 = (var3 > 3) && (var4 > 3); // var3가 3보다 크고 그리고 var4가 3보다 크다
		boolean res2 = (var3 > 2) && (var4 > 3); // var3가 2보다 크고 그리고 var4가 3보다 크다
		boolean res3 = (var3 > 3) || (var4 > 3); // var3가 3보다 크고 또는 var4가 3보다 크다
		boolean res4 = (var3 > 3) || (var4 > 5); // var3가 3보다 크고 또는 var4가 5보다 크다
		boolean res5 = !(var3 > 3) || (var4 > 5); // var3가 var4보다 크지 않다
		
		System.out.println("res1 : " + res1);
		System.out.println("res2 : " + res2);
		System.out.println("res3 : " + res3);
		System.out.println("res4 : " + res4);
		System.out.println("res5 : " + res5);
	}

}
