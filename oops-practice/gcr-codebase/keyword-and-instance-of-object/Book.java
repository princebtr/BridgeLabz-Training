public class Book {
	static String libraryName = "Egmore Library";
	String author;
	String title;
	final String isbn;
	
	Book(String title, String author, String isbn){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	void displayLibraryName() {
		System.out.println(libraryName);
	}
	
//	void display() {
//		System.out.println(InstanceOf(title));
//
//		System.out.println("Title : "+title+"\nAuthor : "+author+"\nISBN : "+isbn);
//	}
	
	void displayBookDetails(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book) obj;
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("ISBN: " + book.isbn);
        } else {
            System.out.println("Object is not a Book");
        }
    }
	
	public static void main(String[] args) {
		Book b = new Book("Effective Java","Joshua Bloch", "978-0134685991");
		
		b.displayLibraryName();
		b.displayBookDetails(b);
	}
}
