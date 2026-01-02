// Problem Statement: A text editing tool receives poorly formatted input from users. Your task is to auto-correct formatting by fixing spacing and capitalizing the first letter of each sentence.
// Problem:
// Write a method that takes a paragraph as input and returns a corrected version with:
// ● One space after punctuation,
// ● Capital letter after period/question/exclamation marks,
// ● Trimmed extra spaces.

import java.util.Scanner;
public class SentenceFormatter {
    public static String formatParagraph(String paragraph) {
        // Trim leading and trailing spaces
        paragraph = paragraph.trim();
        
        // Replace multiple spaces with a single space
        paragraph = paragraph.replaceAll("\\s+", " ");
        
        // Capitalize the first letter of each sentence
        StringBuilder formatted = new StringBuilder();
        boolean capitalizeNext = true;
        
        for (int i = 0; i < paragraph.length(); i++) {
            char currentChar = paragraph.charAt(i);
            
            if (capitalizeNext && Character.isLetter(currentChar)) {
                formatted.append(Character.toUpperCase(currentChar));
                capitalizeNext = false;
            } else {
                formatted.append(currentChar);
            }
            
            // Check for sentence-ending punctuation
            if (currentChar == '.' || currentChar == '!' || currentChar == '?') {
                capitalizeNext = true;
            }
        }
        
        // Ensure one space after punctuation
        String result = formatted.toString().replaceAll("([.!?])\\s*", "$1 ");
        
        return result.trim();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a paragraph to format:");
        String inputParagraph = scanner.nextLine();
        
        String formattedParagraph = formatParagraph(inputParagraph);
        System.out.println("Formatted Paragraph:");
        System.out.println(formattedParagraph);
        
    }
}
