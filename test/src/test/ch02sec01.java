package test;

public class ch02sec01 {
	public static void main(String[] args) {
		
		int hour = 3;
		int minute = 5;
		
		
		System.out.println(hour + "시간" + minute + "분");
		
		int totalminute = (hour*60) + minute;
		System.out.println("총 " + totalminute + "분");
		
		
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
		
		int var1 = 0b1011;
		int var2 = 0206;
		int var3 = 365;
		int var4 = 0xb3;
		
		System.out.println("var1:" + var1);
		System.out.println("var2:" + var2);
		System.out.println("var3:" + var3);
		System.out.println("var4:" + var4);
		
		char c1 = 'A';
		char c2 = 65;
		char c3 = '가';
		char c4 = 44032;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		float v1 = 0.1234567890123456789f;
		double v2 = 0.1234567890123456789;
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		
		double v3 = 3e6;
		float v4 = 3e6F;
		double v5 = 2e-3;
		System.out.println("v3: + " + v3);
		System.out.println("v4: + " + v4);
		System.out.println("v5: + " + v5);
		
		boolean stap = true;
		if(stap) {
			System.out.println("중지합니다.");
		}else{
			System.out.println("시작합니다.");
		}
		int x = 10;
		
			
		}
				
				
				
		
	}


