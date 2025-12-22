import java.util.Scanner;

public class PalindromeCheck {

    static boolean logic1(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end)
            if (s.charAt(start++) != s.charAt(end--)) return false;
        return true;
    }

    static boolean logic2(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return logic2(s, start + 1, end - 1);
    }

    static boolean logic3(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length / 2; i++)
            if (arr[i] != arr[arr.length - i - 1]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Logic 1: " + logic1(text));
        System.out.println("Logic 2: " + logic2(text, 0, text.length() - 1));
        System.out.println("Logic 3: " + logic3(text));
    }
}
