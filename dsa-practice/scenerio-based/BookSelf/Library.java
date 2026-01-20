package BookSelf;
import java.util.*;

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
