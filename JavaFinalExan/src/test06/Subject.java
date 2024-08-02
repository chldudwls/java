package test06;

public class Subject {
    String subName;          // 과목 이름
    Student[] students;      // 수강 학생 배열
    int studentCount;        // 현재 수강생 수

    public Subject(String subName) {
        this.subName = subName;
        this.students = new Student[10]; // 최대 10명의 학생
        this.studentCount = 0;             // 학생 수 초기화
    }

    public String getSubName() {
        return subName;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student; // 학생 추가
            studentCount++; // 학생 수 증가
        } else {
            System.out.println("신청 완료: 최대 수강 인원 초과");
        }
    }

    public void printSubjectInfo() {
        System.out.println("과목: " + getSubName());
        System.out.print("이름: ");
        for (int i = 0; i < studentCount; i++) {
            System.out.print(students[i].getName());
            if (i < studentCount - 1) {
                System.out.print(", "); // 학생 이름 사이에 , 추가
            }
        }
        System.out.println(); // 줄 바꿈
    }
}
