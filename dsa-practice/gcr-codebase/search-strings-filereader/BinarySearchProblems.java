
import java.util.*;

public class BinarySearchProblems {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] > arr[r]) l = m + 1;
            else r = m;
        }
        System.out.println("Rotation Index: " + l);

        int[] nums = {1,2,3,1};
        l = 0; r = nums.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] < nums[m+1]) l = m + 1;
            else r = m;
        }
        System.out.println("Peak Element Index: " + l);

        int[][] matrix = {{1,3,5},{7,9,11}};
        int target = 9;
        boolean found = false;
        l = 0; r = matrix.length * matrix[0].length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            int val = matrix[m / 3][m % 3];
            if (val == target) { found = true; break; }
            if (val < target) l = m + 1;
            else r = m - 1;
        }
        System.out.println(found);
    }
}
