package sec;

public class Car1Example {

	
public static void main(String[] args) {
	
	Car1 mycar = new Car1();
	mycar.setGas(50);
	
	if(mycar.isLeftGas()) {
		System.out.println("출발합니다");
		mycar.run();
	}
	System.out.println("gas를 주입하세요");
}
}
