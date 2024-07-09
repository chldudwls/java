package Sub2;

public class EncapsTest {
	public static void main(String[] args) {
		
		Car sonata = new Car("소나타", "흰색", 0);		
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.setColor("은색");
		sonata.show();
		
		Car avante = new Car("아반테", "검정", 0);
		avante.speedUp(100);
		avante.speedDown(20);
		avante.show();
		
		Account kb = new Account("국민은행", "101-21-1001", "김유신", 10000);
		kb.deposit(40000);
		kb.withdraw(30000);
		
		kb.setName("김유진");
		kb.show();
		
		
		/*
		 * - title (String): 책 제목
		 - author (String): 저자 이름
		 - isbn (String): ISBN 번호
		 - availableCopies (int): 이용 가능한 복사본 수
		 */
		
		
		Book java = new Book("이것이 자바다", "신용권", "121-11-1001", 3);
		
		if(java.borrowBook()) {
			System.out.println("대출성공");
		}else {
			System.out.println("대출실패");
		}
		
		System.out.println("남은 도서 수 : " + java.getavailableCopies());
		java.show();
		
		Book sql = new Book("혼자 공부하는 sql", "우재남", "112=10=1102", 2);
		
		
	}
}
