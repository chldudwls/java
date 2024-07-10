package sec;

public class ComputerExample {
	public static void main(String[] args) {
	
		Computer mycom = new Computer();
		int result1 = mycom.sum(1, 2, 3);
		System.out.println("result1 : " + result1);
		int result2 = mycom.sum(1, 2, 3, 4, 5);
		System.out.println("result2 : " + result2);
		
		int[] valuse = {1, 2, 3, 4, 5};
		int result3 = mycom.sum(valuse);
		System.out.println("result3 : " + result3);
		
		int result4 = mycom.sum(new int[] {1, 2, 3, 4, 5});
		System.out.println("result4 : " + result4);
	
	
	}


}
