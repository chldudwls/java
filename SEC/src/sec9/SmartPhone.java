package sec9;

public class SmartPhone extends Phone {
	SmartPhone(String owner){
		super(owner);
	}
	void internetSearch() {
		System.out.println("인터넷 검색을합니다");
	}
}
