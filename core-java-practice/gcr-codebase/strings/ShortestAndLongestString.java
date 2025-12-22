// Problem Statement: Write a program to split the text into words and find the shortest and longest strings in a given text
// Hint => 
// Take user input using the Scanner nextLine() method 
// Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
// Create a method to find and return a string's length without using the length() method. 
// Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
// Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array. 
// The main function calls the user-defined methods and displays the result. 

import java.util.Scanner;
public class ShortestAndLongestString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = input.nextLine();
        String[] words = splitTextIntoWords(text);
        String[][] wordLengthArray = getWordLengthArray(words);
        String[] shortestAndLongest = findShortestAndLongest(wordLengthArray);
        System.out.println("Shortest String: " + shortestAndLongest[0]);
        System.out.println("Longest String: " + shortestAndLongest[1]);
    }
    public static String[] splitTextIntoWords(String text) {
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
            if (text.charAt(i) != ' ') {
                currentWord.append(text.charAt(i));
            } else {
                words[wordIndex++] = currentWord.toString();
                currentWord.setLength(0);
            }
        }
        words[wordIndex] = currentWord.toString();
        return words;
    }
    public static int getStringLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }
    public static String[][] getWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return wordLengthArray;
    }
    public static String[] findShortestAndLongest(String[][] wordLengthArray) {
        String shortest = wordLengthArray[0][0];
        String longest = wordLengthArray[0][0];
        int minLength = getStringLength(shortest);
        int maxLength = getStringLength(longest);
        for (int i = 1; i < wordLengthArray.length; i++) {
            int currentLength = Integer.parseInt(wordLengthArray[i][1]);
            if (currentLength < minLength) {
                minLength = currentLength;
                shortest = wordLengthArray[i][0];
            }
            if (currentLength > maxLength) {
                maxLength = currentLength;
                longest = wordLengthArray[i][0];
            }
        }
        return new String[]{shortest, longest};
    }
}
