package test01;

public class Main {
	public static void main(String[] args) {
		
		StudentScore sutdent = new StudentScore("홍길동","S001", "자바", 90.0);
		
		sutdent.printStudentInfo();
		System.out.println("------------------------");
		
		sutdent.updateScore(98.0);
		System.out.println("------------------------");
		
		sutdent.updateScore(150.0);
		System.out.println("------------------------");
		
		sutdent.printStudentInfo();
		System.out.println("------------------------");
	}
}
