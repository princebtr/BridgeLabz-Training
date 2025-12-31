// Problem Statement: Book Library System
// Design a Book class with:
// ISBN (public).
// title (protected).
// author (private).
// Write methods to:
// Set and get the author name.
// Create a subclass EBook to access ISBN and title and demonstrate access modifiers.

class Book2 {
    public String ISBN;
    protected String title;
    private String author;

    Book2(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

    class EBook extends Book2 {
    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void display() {
        System.out.println("ISBN: " + ISBN + " | Title: " + title);
    }
    public static void main(String[] args) {
        EBook ebook = new EBook("123-456-789", "Java Programming", "Jane Smith");
        ebook.display();
        System.out.println("Author: " + ebook.getAuthor());
        ebook.setAuthor("John Doe");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
