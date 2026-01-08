// Problem Statement: Write a program to demonstrate ArrayIndexOutOfBoundsException
// Hint => 
// Define a variable of array of names and take input from the user
// Write a Method to generate the Exception. Here access index larger then the length of the array. This will generate a runtime exception and abruptly stop the program. 
// Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the length of the array. This will generate a runtime exception. Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
// From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

public class ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        try{
            generateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception generated in generateException method: " + e.getMessage());
        }
    }
    public static void generateException() {
        String[] names = {"Alice", "Bob", "Charlie"};
        // This will throw ArrayIndexOutOfBoundsException
        System.out.println(names[5]);
    }
    public static void handleException() {
        String[] names = {"Alice", "Bob", "Charlie"};
        try {
            // This will throw ArrayIndexOutOfBoundsException
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
