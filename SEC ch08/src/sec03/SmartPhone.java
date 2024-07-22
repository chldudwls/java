package sec03;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	public String toString() {
		return company + "," + os;
		/*obj의 toString()메소드를 재정의해서
		 * 자료조사와 운영체제가 결합된 문자열을
		 * 리턴함
		 */
	}
}
