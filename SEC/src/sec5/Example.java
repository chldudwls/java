package sec5;

public class Example {
	public static void main(String[] args) {
		
		Parent parent = new Child();
		
		
		parent.method1();
		parent.method2();
		
		
		Child child = (Child) parent;
		
		child.field2="date2";		
		child.method3();
		
		
		
	}
}
