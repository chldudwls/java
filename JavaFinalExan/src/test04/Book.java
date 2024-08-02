package test04;

public class Book {
	String title;
	String author;
	String isbn;
	boolean isBorrowd;
	
	public Book(String title, String author, String isbn) {
		
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowd = false;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", isBorrowd=" + isBorrowd + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public boolean isBorrowd() {
		return isBorrowd;
	}
	public void setBorrowd(boolean isBorrowd) {
		this.isBorrowd = isBorrowd;
	}
	
	public void borrowBook() {
		System.err.println("도서대출 : " + title);
		if(!isBorrowd) {
			isBorrowd = true;
			
		} else {
			System.out.println();
		}
	}
	public void returnBook() {
		if(isBorrowd) {
			isBorrowd = false;
			System.out.println(title);
		} else {
			System.out.println(title);
		}
	}
	public void getBoolInfo() {
		System.out.println("도서명 : " +title);
		System.out.println("저자 : " +author);
		System.out.println("ISBN : " +isbn);
		System.out.println("대풀여부 : " + (isBorrowd ? "불가능" : "가능"));
	}
}
