package test1;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int year;
		int birth;
		String name;
		
		System.err.println("올해 년도 입력 : ");
		year = sc.nextInt();
		
		System.out.println(); 
		birth = sc.nextInt();
		
		System.out.println(); 
		name = sc.next();
		
		int age = year - birth;
		System.out.printf("%s님 안녕하세요.\n당신은 올해 만 %d세 입니다", name, age);
		
		sc.close();
		
		
}
}
