package BookSelf;

// Main Class
public class BookShelf {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("Clean Code", "Robert Martin");
        Book b2 = new Book("Effective Java", "Joshua Bloch");
        Book b3 = new Book("The Hobbit", "J.R.R. Tolkien");

        library.addBook("Programming", b1);
        library.addBook("Programming", b2);
        library.addBook("Fantasy", b3);
        library.addBook("Programming", b1);

        library.printCatalog();

        library.removeBook("Programming", b2);
        library.printCatalog();
    }
}
