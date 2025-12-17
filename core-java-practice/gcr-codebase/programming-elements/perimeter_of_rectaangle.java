import java.util.Scanner;
public class perimeter_of_rectaangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double perimeter = 2 * (l + b);
        System.out.println(perimeter);
    }
}