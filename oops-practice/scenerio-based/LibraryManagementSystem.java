import java.util.Scanner;

public class LibraryManagementSystem {

    static String[] titles = {
        "Java Programming",
        "Data Structures",
        "Operating Systems",
        "Computer Networks",
        "Database Management"
    };

    static String[] authors = {
        "James Gosling",
        "Mark Allen Weiss",
        "Abraham Silberschatz",
        "Andrew Tanenbaum",
        "Raghu Ramakrishnan"
    };

    static boolean[] isAvailable = {
        true, true, true, true, true
    };

    // Display all books
    public static void displayBooks() {
        System.out.println("\nLibrary Books:");
        for (int i = 0; i < titles.length; i++) {
            System.out.println(
                (i + 1) + ". " + titles[i] +
                " | Author: " + authors[i] +
                " | Status: " + (isAvailable[i] ? "Available" : "Checked Out")
            );
        }
    }

    // Search book by partial title
    public static void searchBook(String keyword) {
        boolean found = false;

        for (int i = 0; i < titles.length; i++) {
            if (titles[i].toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(
                    "Found: " + titles[i] +
                    " | Author: " + authors[i] +
                    " | Status: " + (isAvailable[i] ? "Available" : "Checked Out")
                );
                found = true;
            }
        }

        if (!found) {
            System.out.println("No book found with given title.");
        }
    }

    // Update book status
    public static void updateStatus(int index, boolean status) {
        if (index >= 0 && index < titles.length) {
            isAvailable[index] = status;
            System.out.println("Book status updated successfully.");
        } else {
            System.out.println("Invalid book selection.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        displayBooks();

        System.out.print("\nEnter partial title to search: ");
        String searchKey = input.nextLine();
        searchBook(searchKey);

        System.out.print("\nEnter book number to checkout (0 to skip): ");
        int choice = input.nextInt();

        if (choice > 0) {
            if (isAvailable[choice - 1]) {
                updateStatus(choice - 1, false);
            } else {
                System.out.println("Book is already checked out.");
            }
        }

        displayBooks();
    }
}
