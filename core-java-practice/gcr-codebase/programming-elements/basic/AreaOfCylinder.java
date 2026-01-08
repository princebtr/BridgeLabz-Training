import java.util.Scanner;
public class AreaOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double area = 2 * 3.14 * r * (r + h);
        System.out.println(area);
    }
}