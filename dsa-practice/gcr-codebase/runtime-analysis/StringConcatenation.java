public class StringConcatenation {

    public static void main(String[] args) {

        int n = 100_000;

        // String (O(N²))
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < n; i++)
            s += "A";
        System.out.println("String Time: " + (System.currentTimeMillis() - start));

        // StringBuilder (O(N))
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++)
            sb.append("A");
        System.out.println("StringBuilder Time: " + (System.currentTimeMillis() - start));

        // StringBuffer (O(N))
        start = System.currentTimeMillis();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < n; i++)
            sf.append("A");
        System.out.println("StringBuffer Time: " + (System.currentTimeMillis() - start));
    }
}
