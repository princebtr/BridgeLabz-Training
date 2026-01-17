
public class StringBufferVsBuilder {
    public static void main(String[] args) {
        int n = 1_000_000;

        long start = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < n; i++) sbuf.append("hello");
        long bufferTime = System.nanoTime() - start;

        start = System.nanoTime();
        StringBuilder sbld = new StringBuilder();
        for (int i = 0; i < n; i++) sbld.append("hello");
        long builderTime = System.nanoTime() - start;

        System.out.println("StringBuffer Time: " + bufferTime);
        System.out.println("StringBuilder Time: " + builderTime);
    }
}
