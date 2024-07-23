package sec9;

public class asda {
	public static void main(String[] args) {
		for(int x=2 ; x<=9 ; x++) {
			System.out.println(x + "단");
			for(int y=1 ; y<=9 ; y++) {
			int z = x * y;
				System.out.println(x + "x" + y + " = " + z);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			}
		}
	}
}
