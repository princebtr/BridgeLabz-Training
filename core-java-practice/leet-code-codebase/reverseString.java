import java.util.Scanner;
public class reverseString {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        reverseString solution = new reverseString();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] str = input.toCharArray();
        solution.reverseString(str);
        System.out.println(str);
    }
}