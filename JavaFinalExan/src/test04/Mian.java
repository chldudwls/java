package test04;

public class Mian {
	public static void main(String[] args) {
		
		Book book = new Book("이것이 자바다", "신용권", "101-1234-1010");
		
		Member member = new Member("홍길동", "A101");
		
		book.getBoolInfo();
		System.out.println("------------");

		
		member.borrowBook(book);
		System.out.println("------------");
		
		
		book.getBoolInfo();
		System.out.println("------------");
		
		
		member.getMemberInfo();
		System.out.println("------------");
		
		
		member.borrowBook(book);
		System.out.println("------------");
		
		
		member.returnBook(book);
		System.out.println("------------");
		
		
		member.getMemberInfo();
		System.out.println("------------");
	}
}
