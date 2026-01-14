//Problem Statement: Check for a Pair with Given Sum in an Array
//Problem: Given an array and a target sum, find if there exists a pair of elements whose sum is equal to the target.
//Hint: Store visited numbers in a hash map and check if target - current_number exists in the map.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PairSumEqulasTarget {
	public static void main(String[] args) {
		Map<Integer,Integer> sumIndex = new HashMap<>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Size of an array");
		int n = input.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.println("Enter Target");
		int target = input.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == target) {
                    sumIndex.put(i, j);
                }
            }
        }
		
		for(Map.Entry<Integer,Integer> e : sumIndex.entrySet() ) {
			System.out.println(e.getKey()+" | "+e.getValue());
		}
	}

}
