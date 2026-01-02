// Problem Statement:  Create a program that analyzes a given paragraph of text. Implement the following
// functionalities:
// ● Count the number of words in the paragraph.
// ● Find and display the longest word.
// ● Replace all occurrences of a specific word with another word (case-insensitive).
// ● Handle edge cases like empty strings or paragraphs with only spaces.

import java.util.*;
public class StringFormatter2 {
    public static int countWords(String paragraph) {
        if (paragraph == null || paragraph.trim().isEmpty()) {
            return 0;
        }
        String[] words = paragraph.trim().split("\\s+");
        return words.length;
    }
    public static String findLongestWord(String paragraph) {
        if (paragraph == null || paragraph.trim().isEmpty()) {
            return "";
        }
        String[] words = paragraph.trim().split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
    public static String replaceWord(String paragraph, String target, String replacement) {
        if (paragraph == null || paragraph.trim().isEmpty()) {
            return paragraph;
        }
        return paragraph.replaceAll("(?i)\\b" + target + "\\b", replacement);
    }
    public static void main(String[] args) {
        String paragraph = "This is a sample paragraph. This paragraph is for testing.";
        String targetWord = "this";
        String replacementWord = "that";

        int wordCount = countWords(paragraph);
        String longestWord = findLongestWord(paragraph);
        String modifiedParagraph = replaceWord(paragraph, targetWord, replacementWord);

        System.out.println("Word Count: " + wordCount);
        System.out.println("Longest Word: " + longestWord);
        System.out.println("Modified Paragraph: " + modifiedParagraph);
    }
}
