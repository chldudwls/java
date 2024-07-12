package sec;

class Example{
	static String company = "myCompany";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
	}
}

public class Television {
	public static void main(String[] args) {
		System.out.println(Example.info);
	}
}
