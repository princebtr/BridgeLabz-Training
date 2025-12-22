import java.util.Scanner;
public class SecondLargestElent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            System.out.println("Enter element greater than 0: ");
            arr[i] = input.nextInt();
            if(arr[i] <= 0){
                System.out.println("Please enter valid input");
                i--;
            }
        }
	int largest = 0;
	int secLar = 0;
	for(int i=0; i<5; i++){
		if(arr[i] >= largest){
            secLar = largest;
            largest = arr[i];
        }
        else if(arr[i] > secLar && arr[i] != largest){
            secLar = arr[i];
        }
        else if(secLar == largest){
            secLar = arr[i];
        }
	}
    System.out.println("Second largest element is: " + secLar);
    }
}
