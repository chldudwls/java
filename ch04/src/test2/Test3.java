package test2;

import java.util.Scanner;

import javax.print.attribute.standard.PrinterIsAcceptingJobs;

public class Test3 {
public static void main(String[] args) {
	
	int sum = 0;
	for(int i=1 ; i<100 ; i++) {
		if(i%3 == 0)
			sum += i;
	}
System.out.println("3의 배수의함 : " + sum);
	while(true) {
	int num1 = (int)(Math.random()*6) + 1;
	int num2 = (int)(Math.random()*6) + 1;
	System.out.println("("+ num1 + "," + num2 + ")");
	if( (num1+num2) == 3) {
		break;
}
	}
	boolean a = true;
	int balance = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	while(a) {
		System.out.println("--------------------------------");
		System.out.println("1.예금 : 2.출금 : 3.잔고 : 4. 종료");
		System.out.println("--------------------------------");
		System.out.println("선택>");
		
		int s = Integer.parseInt(scanner.nextLine());
		
		switch(s) {
		case 1:
			System.out.println("예금액>");
			balance += Integer.parseInt(scanner.nextLine());
			break;
		case 2:
			System.out.println("출금액");
			balance -= Integer.parseInt(scanner.nextLine());
			break;
		case 3:
			System.out.println("잔고>");
			System.out.println(balance);
			break;
		case 4:
			a= false;
			break;
		}
		System.out.println();
		
	}
	 System.out.println("프로그램 종료");



	
	int as=1;
	for(as=1 ; as<=10 ; as++);
	System.out.println("as : " + as);
		
	}
		
	
}


