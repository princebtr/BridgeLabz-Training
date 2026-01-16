//Problem Statement: Merge Sort - Sort an Array of Book Prices
//A bookstore maintains a list of book prices in an array. Implement Merge Sort to sort the prices in ascending order.
//Hint:
//Divide the array into two halves recursively.
//Sort both halves individually.
//Merge the sorted halves by comparing elements.

public class MergeSortBookPrices {

    // Merge two sorted subarrays
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data into temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // Merge the temp arrays
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    // Merge sort function
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] bookPrices = {450, 299, 799, 150, 999, 499};

        System.out.println("Book prices before sorting:");
        for (int price : bookPrices) {
            System.out.print(price + " ");
        }

        mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("\nBook prices after sorting:");
        for (int price : bookPrices) {
            System.out.print(price + " ");
        }
    }
}
