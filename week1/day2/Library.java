package week1.day2;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library rack = new Library();
		String book = "TestLeaf";
		System.out.println(book);
		rack.addBook(book);
		rack.issueBook();
	}
	
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

}
