//Problem Statement: You are designing a contact organizer for a mobile app.
//Requirements:
//● Each contact includes Name and Phone Number Handling
//● Store contacts in a List<Contact>.
//● Allow adding, deleting, and searching.
//● If the phone number is not exactly 10 digits, throw InvalidPhoneNumberException.
//● Prevent duplicate contacts based on phone number.

package oops;
import java.util.*;

public class Contacts {
    String name;
    String number;
    static Map<String, String> contact = new HashMap<>();

    Contacts(String name, String number) {
        this.name = name;
        this.number = number;
    }

    // Add Contact
    public void add() {
        if (!number.matches("\\d{10}")) {
            System.out.println("Enter a valid 10-digit phone number");
            return;
        }
        if (contact.containsValue(number)) {
            System.out.println("Duplicate phone number not allowed");
            return;
        }

        contact.put(name, number);
        System.out.println("Contact added successfully");
    }

    // Delete Contact by name
    public static void delete(String name) {
        if (contact.remove(name) != null) {
            System.out.println("Contact deleted successfully");
        } else {
            System.out.println("Contact not found");
        }
    }

    // Search Contact by name
    public static void search(String name) {
        if (contact.containsKey(name)) {
            System.out.println("Name: " + name + ", Phone: " + contact.get(name));
        } else {
            System.out.println("Contact not found");
        }
    }

    // Display All Contacts
    public static void displayAll() {
        if (contact.isEmpty()) {
            System.out.println("No contacts available");
            return;
        }

        System.out.println("Contact List:");
        for (Map.Entry<String, String> entry : contact.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add Contact");
        System.out.println("2. Delete Contact");
        System.out.println("3. Search Contact");
        System.out.println("4. Display All Contacts");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        switch (choice) {

        case 1:
            System.out.println("Enter name: ");
            String name = sc.nextLine();

            System.out.println("Enter phone number: ");
            String number = sc.nextLine();

            Contacts c = new Contacts(name, number);
            c.add();
            break;

        case 2:
            System.out.print("Enter name to delete: ");
            delete(sc.nextLine());
            break;

        case 3:
            System.out.print("Enter name to search: ");
            search(sc.nextLine());
            break;

        case 4:
            displayAll();
            break;

        default:
            System.out.println("Invalid choice");
    }
    }
}
