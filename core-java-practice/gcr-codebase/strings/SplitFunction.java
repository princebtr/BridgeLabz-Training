// Problem Statement: Write a program to split the text into words, compare the result with the split() method and display the result 
// Hint => 
// Take user input using the Scanner nextLine() method 
// Create a Method to find the length of the String without using the built-in length() method. 
// Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
// Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
// Then Create an array to store the words and use the indexes to extract the words
// Create a method to compare the two String arrays and return a boolean
// The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result

import java.util.Scanner;
public class SplitFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] wordsUsingCustomSplit = customSplit(text);
        String[] wordsUsingBuiltInSplit = text.split(" ");
        
        System.out.println("Words using custom split:");
        for (String word : wordsUsingCustomSplit) {
            System.out.println(word);
        }
        
        System.out.println("Words using built-in split:");
        for (String word : wordsUsingBuiltInSplit) {
            System.out.println(word);
        }
        
        boolean areEqual = compareStringArrays(wordsUsingCustomSplit, wordsUsingBuiltInSplit);
        System.out.println("Are both split methods equal? " + areEqual);
    }
    public static String[] customSplit(String str) {
        int wordCount = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }
        
        String[] words = new String[wordCount];
        int start = 0, wordIndex = 0;
        
        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                words[wordIndex] = str.substring(start, i);
                wordIndex++;
                start = i + 1;
            }
        }
        
        return words;
    }
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}
