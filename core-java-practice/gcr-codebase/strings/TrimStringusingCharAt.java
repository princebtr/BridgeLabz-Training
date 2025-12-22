import java.util.Scanner;

public class TrimStringusingCharAt {

    // Method to find start and end index after trimming spaces
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String input = sc.nextLine();

        int[] indexes = findTrimIndexes(input);
        String trimmedByCharAt = createSubstring(input, indexes[0], indexes[1]);

        String trimmedByMethod = input.trim();

        boolean isSame = compareStrings(trimmedByCharAt, trimmedByMethod);

        System.out.println("Trimmed using charAt(): '" + trimmedByCharAt + "'");
        System.out.println("Trimmed using trim():   '" + trimmedByMethod + "'");
        System.out.println("Both results are equal: " + isSame);
    }
}
