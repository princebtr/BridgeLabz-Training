import java.util.*;

// Book Entity 
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book b = (Book) obj;
        return title.equals(b.title) && author.equals(b.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}

// Library Manager
class Library {
    private Map<String, LinkedList<Book>> genreMap = new HashMap<>();
    private Set<Book> bookSet = new HashSet<>();

    public void addBook(String genre, Book book) {
        if (bookSet.contains(book)) {
            System.out.println("Duplicate book ignored: " + book);
            return;
        }

        genreMap.putIfAbsent(genre, new LinkedList<>());
        genreMap.get(genre).add(book);
        bookSet.add(book);

        System.out.println("Added: " + book + " to " + genre);
    }

    public void removeBook(String genre, Book book) {
        if (!genreMap.containsKey(genre)) {
            System.out.println("Genre not found");
            return;
        }

        if (genreMap.get(genre).remove(book)) {
            bookSet.remove(book);
            System.out.println("Removed: " + book);
        } else {
            System.out.println("Book not found in genre");
        }
    }

    public void printCatalog() {
        System.out.println("\nLibrary Catalog:");
        for (String genre : genreMap.keySet()) {
            System.out.println("Genre: " + genre);
            for (Book book : genreMap.get(genre)) {
                System.out.println("  - " + book);
            }
        }
    }
}

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
