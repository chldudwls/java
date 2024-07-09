package Sub1;

public class ClassTest {
	public static void main(String[] args) {
		
		Car sonata = new Car();
		
		sonata.name = "소나타";
		sonata.color = "흔색";
		sonata.speed = 0;
		
		sonata.speedUp(100);
		sonata.speedDown(20);
		sonata.show();
		
		Car avante = new Car();
		avante.name = "아반테";
		avante.color = "검정";
		avante.speed = 0;
		
		avante.speedUp(200);
		avante.speedDown(40);
		avante.show();
		
		Account kb = new Account();
		kb.bank = "국민은행";
		kb.acc = "101-21-1001";
		kb.name = "김유신";
		kb.balance = 10000;
		
		
		kb.deposit(20000);
		kb.withdraw(15000);
		kb.show();
	}
}
