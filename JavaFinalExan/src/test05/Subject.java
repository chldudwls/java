package test05;

public class Subject {
	private String subName; //과목명
	private  Student[] students; //과목수강 학생 배열
	private  int studentCount; // 현재 수강중인 학생수
	
	
	public Subject(String subName) {
        this.subName = subName;
        this.students = new Student[10]; // 최대 10명의 학생 수강 가능
        this.studentCount = 0; // 초기 수강 학생 수는 0
	}
	
	
	public String getSubName() {
		return subName;
	}


	public void setSubName(String subName) {
		this.subName = subName;
	}


	public void addStudent(Student student) {
		if(studentCount < students.length) {
			students[studentCount] = student; 
			
			studentCount++;
		}else {
			System.out.println("신청초과");
		}
	
	}
	public void printSubjectInfo() {
        System.out.println("과목: " + getSubName());
        System.out.print("이름: ");
        System.out.println("신청ss완료");

        // 수강생들의 이름을 출력
        for (int i = 0; i < studentCount; i++) {
            System.out.print(students[i].getName());
            if (i < studentCount - 1) {
                System.out.print(", "); // 학생 이름 사이에 , 추가
            }
        }
        System.out.println(); // 줄 바꿈
        
    }
}