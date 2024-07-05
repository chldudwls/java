package test1;

public class Test {
	public static void main(String[] args) {
		
	int score = 78; 
	if(score >= 90) {
		System.out.println("점수가 100~90보다 큽니다");
		System.out.println("등급은 a입니다.");
		
	}
	else if(score >= 80 ) {
		System.out.println("점수가 80~89 입니다");
		System.out.println("등급은 b입니다");}
	else if(score >= 70 ) {
		System.out.println("점수가 70~79 입니다");
		System.out.println("등급은 c입니다");
		
	}else {
		System.out.println("점수가 70 미만입니다.");
		System.out.println("등급은 d입니다");
	}
	
	
	int num =(int)(Math.random()*6) + 1;
	
	if(num==1) {
		System.out.println("1번이 나왔습니다");
	}else if(num==2) {
			System.out.println("2번이 나왔습니다");
	}else if(num==3) {
			System.out.println("3번이 나왔습니다");
	}else if(num==4) {
		System.out.println("4번이 나왔습니다");
	}else if(num==5) {
		System.out.println("5번이 나왔습니다");
	}else {
		System.out.println("6번이 나왔습니다");
	}
	
}

}
