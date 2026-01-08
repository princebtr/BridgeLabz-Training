import java.util.Scanner;
public class GCDAndLCMCalculator {

    // Method to calculate GCD
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // Method to calculate LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("GCD = " + gcd(num1, num2));
        System.out.println("LCM = " + lcm(num1, num2));

        sc.close();
    }
}
