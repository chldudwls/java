package test05;

public class Student {
	String name;
	String studentId;
	String[] subjects;
	int[] scores;
	int subjectCount;
	public Student(String name, String studentId) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.subjects = new String[10];
		this.scores = new int[10];
		this.subjectCount = 0;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void enrollSubject(Subject subject) {
		if(subjectCount < subjects.length) {
			subjects[subjectCount] = subject.getSubName();
			subject.addStudent(this);
			subjectCount++;
			System.out.println(getName()+" - " + subject.getSubName() + "과목 신청완료");
		}
	
		
	}
	public void setScore(Subject subject, int score) {
		String subjectName = subject.getSubName();

		for(int i = 0; i < subjectCount; i++) {
			if(subjects[i].equals(subjectName)) {
				 scores[i] = score;
				 System.out.println(name + " - "  + subjectName + " 점수 입력완료");
				 return;
			}
		}
	}
	public void printStudentInfo() {
		
		System.out.println("학생 이름" + name );
		System.out.println("학생 아이디" + studentId);
		
		for (int i = 0; i < subjectCount; i++) {
			System.out.println(subjects[i] + " : " + scores[i]);
		}
		
	}






}
