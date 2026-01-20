public class FibonacciComparison {

    // Recursive O(2^N)
    static int fibRecursive(int n) {
        if (n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    // Iterative O(N)
    static int fibIterative(int n) {
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        fibRecursive(30);
        System.out.println("Recursive Time: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        fibIterative(50);
        System.out.println("Iterative Time: " + (System.currentTimeMillis() - start));
    }
}
