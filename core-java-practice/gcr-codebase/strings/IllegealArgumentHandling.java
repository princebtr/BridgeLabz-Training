// Problem Statemment: Write a program to demonstrate IllegalArgumentException
// Hint => 
// Define a variable of type String and take user input to assign a value
// Write a Method to generate the Exception. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception and abruptly stop the program. 
// Write the Method to demonstrate IllegalArgumentException. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception. Use the try-catch block to handle the IllegalArgumentException and the generic runtime exception
// From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

public class IllegealArgumentHandling{
    public static void main(String[] args) {
        String str = "Ram is a good boy";
        try{
            generateException(str);
        } catch(IllegalArgumentException e){
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
    public static void generateException(String str) {
        // This will generate StringIndexOutOfBoundsException
        String subStr = str.substring(10, 5);
        System.out.println("Substring: " + subStr);
    }
    public static void handleException(String str){
        try{
            String subStr = str.substring(10, 5);
            System.out.println("Substring: " + subStr);
        } catch (IllegalArgumentException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}