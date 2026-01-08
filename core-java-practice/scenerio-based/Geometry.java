import java.util.Scanner;
public class Geometry {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		start
		System.out.println("Welcome to Line Comparison Computation Program");
		
		System.out.println("Enter cords for line 1 :");
		int x1 = input.nextInt();
		int x2 = input.nextInt();
		int y1 = input.nextInt();
		int y2 = input.nextInt();
		
		System.out.println("Enter cords for line 2 :");
		int u1 = input.nextInt();
		int u2 = input.nextInt();
		int v1 = input.nextInt();
		int v2 = input.nextInt();
		
//		use case 1
		Double length1 = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		Double length2 = Math.sqrt(Math.pow((u2-u1), 2) + Math.pow((v2-v1), 2));
		
//		use case 2
		if(length1.equals(length2)) {
			System.out.println("Both lines are of equal length");
		} else {
			System.out.println("Both lines are not of equal length");
		}
		
//		use case 3
		int compareResult = length1.compareTo(length2);

        if (compareResult == 0) {
            System.out.println("Both lines are Equal");
        } else if (compareResult > 0) {
            System.out.println("Line 1 is Greater than Line 2");
        } else {
            System.out.println("Line 1 is Less than Line 2");
        }
	}

}
