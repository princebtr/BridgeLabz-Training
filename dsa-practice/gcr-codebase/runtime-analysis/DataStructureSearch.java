import java.util.*;

public class DataStructureSearch {

    public static void main(String[] args) {

        int n = 1_000_000;
        int target = n - 1;

        int[] array = new int[n];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        long start = System.nanoTime();
        for (int x : array)
            if (x == target) break;
        System.out.println("Array Search: " + (System.nanoTime() - start));

        start = System.nanoTime();
        hashSet.contains(target);
        System.out.println("HashSet Search: " + (System.nanoTime() - start));

        start = System.nanoTime();
        treeSet.contains(target);
        System.out.println("TreeSet Search: " + (System.nanoTime() - start));
    }
}
 