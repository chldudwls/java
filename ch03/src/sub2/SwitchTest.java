package sub2;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		
		System.out.print("숫자 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println("입력한 숫자 : " + number);
		
		switch(number % 2) {
			case 0:
				System.out.println("number는 짝수");
				break;
			case 1:
				System.out.println("number는 홀수");
				break;
			
		}
	}

}
