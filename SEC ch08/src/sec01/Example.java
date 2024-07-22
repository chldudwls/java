package sec01;

public class Example {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) { 
			//매개값이 Member 타입이고 id도 동일하므로 true
			System.out.println("obj1과obj2는 동등합니다");
		}else {
			System.out.println("obj1과obj2는 동등하지 않습니다");
		}
		
		if(obj1.equals(obj3)) {
			//매개값이 Member 타입이고 id가 다르므로 fales
			System.out.println("obj1과obj3는 동등합니다");
		}else {
			System.out.println("obj1과obj3는 동등하지 않습니다");
		}
	}
}
