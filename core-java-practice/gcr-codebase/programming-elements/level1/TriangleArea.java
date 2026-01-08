import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        double height = sc.nextDouble();

        double areaInSqInches = 0.5 * base * height;
        double areaInSqCm = areaInSqInches * 6.4516;

        System.out.println("Area of triangle is " + areaInSqInches +
                " square inches and " + areaInSqCm + " square centimeters");
    }
}
