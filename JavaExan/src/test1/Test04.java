package test1;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {

	Scanner	sc = new Scanner(System.in);
	
	System.out.println("점수 입력 : ");
	int score = sc.nextInt();
	char grade; 
	
	if ( score >= 90) {
		grade = 'A';
	}else if (score >= 80) {
		grade = 'B';
	}else if (score >= 70) {
		grade = 'C';
	}else if (score >= 60) {
		grade = 'D';
	}else{
		grade = 'F';
	}
	System.out.printf("등급은 %c입니다.", grade);
}
}
