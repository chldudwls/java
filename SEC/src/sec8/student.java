package sec8;

public class student extends person {
	public int studentNo;
	
	public student(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
		
	}
	
	public void study() {
		System.out.println(("공부를 합니다."));
	}
}
