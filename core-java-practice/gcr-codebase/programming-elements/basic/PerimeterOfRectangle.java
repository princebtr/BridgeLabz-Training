import java.util.Scanner;
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double perimeter = 2 * (l + b);
        System.out.println(perimeter);
    }
}