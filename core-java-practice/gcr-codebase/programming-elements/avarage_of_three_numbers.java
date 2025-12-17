import java.util.Scanner;
public class avarage_of_three_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double average = (a + b + c) / 3;
        System.out.println(average);
    }
}