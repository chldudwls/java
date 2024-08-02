package test05;

public class Mian {
	public static void main(String[] args) {
		
		Subject java = new Subject("자바");
		Subject database = new Subject("데이터베이스");
		
		Student student1 = new Student("김유신", "s501");
		Student student2 = new Student("김춘추", "s502");
		
		
		student1.enrollSubject(java);
		student1.enrollSubject(database);
		System.out.println("-------------------------");
		
		student2.enrollSubject(java);
		student2.enrollSubject(database);
		
		System.out.println("-------------------------");
		
		
		student1.setScore(java, 96);
		student1.setScore(database, 96);
		System.out.println("-------------------------");
		
		
		student2.setScore(java, 96);
		student2.setScore(database, 96);
		System.out.println("-------------------------");
		
		
		
		java.printSubjectInfo();
		System.out.println("-------------------------");
		
		
		
		database.printSubjectInfo();
		System.out.println("-------------------------");

		student1.printStudentInfo();
		System.out.println("-------------------------");
		
		student2.printStudentInfo();
		System.out.println("-------------------------");
	}
}
