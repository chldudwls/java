package Sub7;
/*
 * 날짜 /2024/7/10
 * 이름: 최영진
 * 내용: 추상 클래스ㅜ 실습하기
 */
public class AbstracTest {

	public static void main(String[] args) {
		
		//추상 클래스는 객체생성 x
		//Animal animal = new animal();
		
		
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		Animal shark = new Shark();
		
		tiger.move();
		tiger.hunt();
	
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
	}
	
}
