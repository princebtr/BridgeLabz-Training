// Problem Statement:
// Create a Java program that reads a file named "data.txt". If the file does not exist, handle the IOException properly and display a user-friendly message.
// Expected Behavior:
// If the file exists, print its contents.
// If the file does not exist, catch the IOException and print "File not found".


public class CheckedException {
    public static void main(String[] args) {
        java.io.FileReader file = null;
        try {
            file = new java.io.FileReader("data.txt");
            java.io.BufferedReader reader = new java.io.BufferedReader(file);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (java.io.IOException e) {
            System.out.println("File not found");
        } finally {
            try {
                if (file != null) {
                    file.close();
                }
            } catch (java.io.IOException e) {
                System.out.println("Error closing the file");
            }
        }
    }
}
