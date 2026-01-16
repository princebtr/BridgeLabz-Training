import java.util.Arrays;

public class CountingSortStudentAges {

    static void countingSort(int[] arr, int minAge, int maxAge) {
        int range = maxAge - minAge + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];

        // Count frequency
        for (int age : arr) {
            count[age - minAge]++;
        }

        // Cumulative count
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Build output array
        for (int i = arr.length - 1; i >= 0; i--) {
            int age = arr[i];
            output[count[age - minAge] - 1] = age;
            count[age - minAge]--;
        }

        // Copy back
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 18, 14, 12, 16};

        countingSort(ages, 10, 18);
        System.out.println("Sorted Student Ages: " + Arrays.toString(ages));
    }
}
