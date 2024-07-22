package sec03;

public class Exmpale {
	public static void main(String[] args) {
		SmartPhone sm = new SmartPhone("삼성전자", "안드로이드");
		
		String strobj = sm.toString();
		System.out.println(strobj);
		
		System.out.println(sm);
	}
}
