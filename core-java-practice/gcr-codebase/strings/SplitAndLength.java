// Problem Statement: Write a program to split the text into words and return the words along with their lengths in a 2D array
// Hint => 
// Take user input using the Scanner nextLine() method 
// Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
// Create a method to find and return a string's length without using the length() method. 
// Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
// The main function calls the user-defined method and displays the result in a tabular format. During display make sure to convert the length value from String to Integer and then display

import java.util.Scanner;
public class SplitAndLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text:");
        String inputText = scanner.nextLine();

        String[] words = splitIntoWords(inputText);
        String[][] wordsWithLengths = getWordsWithLengths(words);

        System.out.printf("%-15s %-10s%n", "Word", "Length");
        for (String[] wordLengthPair : wordsWithLengths) {
            System.out.printf("%-15s %-10d%n", wordLengthPair[0], Integer.parseInt(wordLengthPair[1]));
        }
    }
    public static String[] splitIntoWords(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar == ' ') {
                words[wordIndex++] = currentWord.toString();
                currentWord.setLength(0);
            } else {
                currentWord.append(currentChar);
            }
        }
        words[wordIndex] = currentWord.toString();

        return words;
    }
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }
    public static int getStringLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }
}
