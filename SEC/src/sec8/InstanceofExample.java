package sec8;

public class InstanceofExample {
	
	public static void personInfo(person person) {
		System.out.println("name"+ person.name);
		person.walk();
	
	if(person instanceof student student) {
		System.out.println("studentNo: " + student.studentNo);
		student.study();
	}
	}
	public static void main(String[] args) {
		person p1 = new person("홍길동");
		personInfo(p1);
		
		System.out.println();
		
		person p2 = new student("김길동", 10);
		personInfo(p2);
		
	}
	
	}



