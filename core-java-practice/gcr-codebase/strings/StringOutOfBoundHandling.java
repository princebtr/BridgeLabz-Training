// Problem Statement: Write a program to demonstrate StringIndexOutOfBoundsException
// Hint => 
// Define a variable of type String and take user input to assign a value
// Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String. This will generate a runtime exception and abruptly stop the program.
// Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String. Then write try catch block for Exception while accessing the String method
// From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException


public class StringOutOfBoundHandling {
    public static void generateException(String text) {
        // This will throw StringIndexOutOfBoundsException
        System.out.println(text.charAt(text.length()));
    }
    public static void handleException(String text) {
        try {
            // This will throw StringIndexOutOfBoundsException
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled successfully.");
        }
    }
    public static void main(String[] args) {
        String text = "Hello, World!";
         // Calling method that generates exception
        try{
            generateException(text);
        } catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException occurred.");
        }

        // Calling method that handles exception
        handleException(text);
    }
}