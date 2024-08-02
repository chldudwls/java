package test04;

public class Member {
	String name;
	String memberId;
	Book borroedBook;

	@Override
	public String toString() {
		return "Member [name=" + name + ", memberId=" + memberId + ", borroedBook=" + borroedBook + "]";
	}

	public Member(String name, String memberId) {
		super();
		this.name = name;
		this.memberId = memberId;
		this.borroedBook = null;
	}

	public Book getBorroedBook() {
		return borroedBook;
	}

	public void setBorroedBook(Book borroedBook) {
		this.borroedBook = borroedBook;
	}
	
	public void borrowBook(Book book) {
		if(borroedBook != null) {
		System.out.println(book.getTitle() + " 이미 대출됨");
	} else {
		if(!book.isBorrowd()){
			borroedBook = book;
			book.borrowBook();
			System.out.println(book.getTitle()+"이미대출");
		}else {
			System.out.println(book.getTitle() + "은 이미 대풀됨");
		}
		
	}
}
	public void returnBook(Book book) {
		if(borroedBook != null) {
			borroedBook.returnBook();
			System.out.println("도서 반납 : " + borroedBook.getTitle());
			borroedBook = null;
		}else {
			System.out.println("도서가 없다");
		}
	}
	public void getMemberInfo() {
		System.out.println("회원명 : " + name);
		System.out.println("아이디 : " + memberId);
		if(borroedBook != null) {
			System.out.println("대풀한 도서 : " + borroedBook.getTitle());
		}else {
			System.out.println("대출한 도서 : 없음");
		}
	}
}