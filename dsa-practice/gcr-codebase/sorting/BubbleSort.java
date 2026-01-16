//Problem Statement: Bubble Sort - Sort Student Marks
//A school maintains student marks in an array. Implement Bubble Sort to sort the student marks in ascending order.
//Hint:
//Traverse through the array multiple times.
//Compare adjacent elements and swap if needed.
//Repeat the process until no swaps are required.

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		for(int i=0; i<arr.length - 1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] marks = {7,5,9,12,3,1,66};
		System.out.println("Student Marks before sorting");
		for(int i : marks) {
			System.out.print(i+" ");
		}
		bubbleSort(marks);
		System.out.println();
		System.out.println("Student Marks after sorting");
		for(int i : marks) {
			System.out.print(i+" ");
		}
	}
}
