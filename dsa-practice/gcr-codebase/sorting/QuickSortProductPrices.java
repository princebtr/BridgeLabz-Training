//Quick Sort - Sort Product Prices
//Problem Statement:
//An e-commerce company wants to display product prices in ascending order. Implement Quick Sort to sort the product prices.
//Hint:
//Pick a pivot element (first, last, or random).
//Partition the array such that elements smaller than the pivot are on the left and larger ones are on the right.
//Recursively apply Quick Sort on left and right partitions.

import java.util.Arrays;

public class QuickSortProductPrices {

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] prices = {1200, 450, 3000, 800, 1500};

        quickSort(prices, 0, prices.length - 1);
        System.out.println("Sorted Product Prices: " + Arrays.toString(prices));
    }
}
