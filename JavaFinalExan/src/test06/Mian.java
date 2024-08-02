package test06;

public class Mian {
    public static void main(String[] args) {
        // Subject 객체 생성
        Subject java = new Subject("자바");
        Subject database = new Subject("데이터베이스");

        // Student 객체 생성
        Student student1 = new Student("김유신", "S001");
        Student student2 = new Student("김춘추", "S002");

        // 학생이 과목에 수강 신청
        student1.enrollSubject(java);
        student1.enrollSubject(database);
        System.out.println("-------------------------");
        student2.enrollSubject(java);
        student2.enrollSubject(database);

        System.out.println("-------------------------");

        // 과목 정보 출력
        java.printSubjectInfo();
        System.out.println("-------------------------");
        database.printSubjectInfo();
        System.out.println("-------------------------");

        // 학생 점수 입력
        student1.setScore(java, 96);
        student1.setScore(database, 90);
        System.out.println("-------------------------");
        student2.setScore(java, 86);
        student2.setScore(database, 76);

        // 학생 정보 출력
        System.out.println("-------------------------");
        student1.printStudentInfo();
        System.out.println("-------------------------");
        student2.printStudentInfo();
    }
}
