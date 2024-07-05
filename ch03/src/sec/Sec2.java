package sec;

public class Sec2 {
	public static void main(String[] args) {
		byte v1 = 10;
		byte v2 = 4;
		int v3 =5;
		long v4 = 10l;
		
		int resut1 = v1 + v2;
		System.out.println("resut1:" + resut1);
		
		long resut2 = v1 + v3 - v4;
		System.out.println("resut2:" + resut2);
	
		double resut3 = (double) v1 / v2 ;
		System.out.println("resut3:" + resut3);
		
		int resut4 = v1 % v2;
		System.out.println("resut4:" + resut4);
	}
}
