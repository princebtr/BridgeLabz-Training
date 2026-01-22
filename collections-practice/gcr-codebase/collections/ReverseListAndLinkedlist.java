//Problem Statement: Reverse a List
//Write a program to reverse the elements of a given List without using built-in reverse methods. Implement it for both ArrayList and LinkedList.
//Example:
//Input: [1, 2, 3, 4, 5] → Output: [5, 4, 3, 2, 1].

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ReverseListAndLinkedlist {
//    Reverse an ArrayList without built-in reverse
    public static <T> void reverseArrayList(ArrayList<T> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

//    Reverse a LinkedList without built-in reverse
    public static <T> void reverseLinkedList(LinkedList<T> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
    
//    Main method
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        reverseArrayList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}
