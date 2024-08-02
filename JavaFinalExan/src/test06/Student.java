package test06;

public class Student {
    String name;
    String studentId;
    String[] subjects; // 수강 과목
    int[] scores;      // 성적
    int subjectCount;  // 수강 과목 수

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.subjects = new String[10]; // 최대 10과목
        this.scores = new int[10];       // 최대 10과목에 대한 성적
        this.subjectCount = 0;           // 과목 수 초기화
    }

    public String getName() {
        return name;
    }

    public void enrollSubject(Subject subject) {
        if (subjectCount < subjects.length) {
            subjects[subjectCount] = subject.getSubName(); // 과목 이름 저장
            subject.addStudent(this); // Subject 클래스의 addStudent 메서드를 통해 학생 추가
            subjectCount++; // 수강 과목 수 증가
            System.out.println(getName() + " - " + subject.getSubName() + " 과목 신청완료");
        } else {
            System.out.println(getName() + " - 수강 과목 수 초과");
        }
    }

    public void setScore(Subject subject, int score) {
        String subjectName = subject.getSubName();

        for (int i = 0; i < subjectCount; i++) {
            if (subjects[i].equals(subjectName)) {
                scores[i] = score; // 성적 입력
                System.out.println(name + " - " + subjectName + " 점수 입력완료");
                return;
            }
        }
        System.out.println("수강하지 않은 과목입니다: " + subjectName);
    }

    public void printStudentInfo() {
        System.out.println("학생 이름: " + name);
        System.out.println("학생 아이디: " + studentId);
        
        // 성적 정보 출력
        for (int i = 0; i < subjectCount; i++) {
            System.out.println(subjects[i] + ": " + scores[i]);
        }
    }
}
