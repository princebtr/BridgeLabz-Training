//Problem Statement: Remove Duplicates While Preserving Order
//Remove duplicate elements from a list while maintaining the original order of elements.
//Example:
//Input: [3, 1, 2, 2, 3, 4] → Output: [3, 1, 2, 4].

import java.util.*;

public class RemoveDuplicates {

    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> set = new HashSet<>();
        List<T> result = new ArrayList<>();

        for (T item : list) {
            if (set.add(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
        System.out.println(removeDuplicates(list));
    }
}
