package week1.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Library rack = new Library();
			String book1 = rack.addBook("Atomic Habits");
			System.out.println("Added book is:"+" "+book1);
			boolean bookRequest = true;
			if (bookRequest==true) {
				System.out.println("Book request accepted");
				rack.issueBook();
			}
	}

}
