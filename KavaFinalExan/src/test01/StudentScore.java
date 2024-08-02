package test01;

import java.util.ArrayList;
import java.util.List;

public class StudentScore {
	List<Double> updateScore = new ArrayList<>();
	String studentName;
	String studentId;
	String subject;
	double score;
	public StudentScore(String studentName, String studentId, String subject, double score) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
		this.updateScore.add(score);
	}
	public String toString() {
		return "StudentScore [studentName=" + studentName + ", studentId=" + studentId + ", subject=" + subject
				+ ", score=" + score + "]";
	}
	
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	public void updateScore(double newScore) {

		this.score = newScore;
		updateScore.add(newScore);
		if(newScore >= 0 && newScore <= 100) {
			this.score = newScore;
			updateScore.add(newScore);
			System.out.println("점수 수정 완료");
		}else {
			System.out.println("잘못된 점수");
			
		}
	}
	public void printStudentInfo() {
		System.out.println(studentName);
		System.out.println(studentId);
		System.out.println(subject);
		System.out.println(score);
	}
	}

