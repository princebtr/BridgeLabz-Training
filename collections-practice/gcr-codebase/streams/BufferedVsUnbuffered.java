import java.io.*;
public class BufferedVsUnbuffered {
    private static final int BUFFER_SIZE = 4096;
    public static void main(String[] args) throws IOException {
        File src = new File("largeFile.dat");
        copyUnbuffered(src, new File("unbufferedCopy.dat"));
        copyBuffered(src, new File("bufferedCopy.dat"));
    }
    static void copyUnbuffered(File src, File dest) throws IOException {
        long start = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int read;
            while ((read = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, read);
            }
        }
        long end = System.nanoTime();
        System.out.println("Unbuffered Time: " + (end - start)/1_000_000 + " ms");
    }
    static void copyBuffered(File src, File dest) throws IOException {
        long start = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int read;
            while ((read = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, read);
            }
        }
        long end = System.nanoTime();
        System.out.println("Buffered Time: " + (end - start)/1_000_000 + " ms");
    }
}
