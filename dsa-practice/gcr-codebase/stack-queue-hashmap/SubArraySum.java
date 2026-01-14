//Problem Statement: Find All Subarrays with Zero Sum
//Problem: Given an array, find all subarrays whose elements sum up to zero.
//Hint: Use a hash map to store the cumulative sum and its frequency. If a sum repeats, a zero-sum subarray exists

import java.util.*;
public class SubArraySum {
	public static void main(String[] args) {
		Map<Integer,Integer> sumIndex = new HashMap<>();
		int[] arr = {1,2,-3,5,6,8,-8,-6};
	
		for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    sumIndex.put(i, j);
                }
            }
        }
		
		for(Map.Entry<Integer,Integer> e : sumIndex.entrySet() ) {
			System.out.println(e.getKey()+" | "+e.getValue());
		}
	}
}
