import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double b = sc.nextDouble();
        double h = sc.nextDouble();

        double areaCm = 0.5 * b * h;
        double areaIn = areaCm / 6.4516;

        System.out.println("The Area of the triangle in sq in is " 
                + areaIn + " and sq cm is " + areaCm);
    }
}
