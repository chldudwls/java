package test;

public class sec2 {
	public static void main(String[] args) {
		
		boolean stap = true;
		if(stap) {
			System.out.println("중지합니다.");
		}else{
			System.out.println("시작합니다.");
		}
		int x = 10;
		boolean result1 = (x == 20);
		boolean result2 = (x != 20);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		
		
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는\"자바\"를 배웁니다.";
		System.out.println(str);
		
		str = "번호\t이름\t직업";
		System.out.print(str);
		
		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다.");
		
		
		
		String st1 = "" + 
		"{\n" +
		"\t\"id\":\"winter\",\n" +
		"\t\"name\":\"눈송이\"\n" +
		"}";
		
		String st2 = """
		{
		"id":"winter",
		"name":"눈송이"
		}
	 """;
		
		System.out.println(st1);
		System.out.println("--------------------------------");
		System.out.println(st2);
		System.out.println("--------------------------------");
		String sr = """
				나는 자바를 \
				학습합니다.
				나는 자바 고수가 될 겁니다.
				""";
		System.out.println(sr);
	}
}
				
		
						
		
				
		
				
				
		
				
