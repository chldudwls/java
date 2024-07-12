package sec1;
	class Sing{
		private static Sing sing = new Sing();
		
		private Sing() {
					}
	
	public static Sing getInstance() {
		return sing;
	}
	}

public class Singleton {
	public static void main(String[] args) {
		Sing ㅁ1 = Sing.getInstance();
		Sing ㅁ2 = Sing.getInstance();
	
		if(ㅁ1 == ㅁ2) {
			System.out.println("같은 Sing 객체입니다");
		}else {
			System.out.println("다른 Sing 객체입니다");
		}
	
	
	}
}
