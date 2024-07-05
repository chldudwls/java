package sec;

public class Sec4 {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		System.out.println("사과 1개에서 남은 양" + result);
		
		
		apple = 1;
		int totalPieces = apple * 10;
		number = 7;
		
		int result1 = totalPieces - number;
		System.out.println("10조각에서 남은 조각:" + result1);
		System.out.println("사과 1개에서 남은 양:" + result1 / 10.0);
	}
}
