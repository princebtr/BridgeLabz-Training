import java.io.*;

public class FileReadComparison {

    public static void main(String[] args) throws Exception {

        File file = new File("largefile.txt");

        // FileReader
        long start = System.currentTimeMillis();
        FileReader fr = new FileReader(file);
        while (fr.read() != -1);
        fr.close();
        System.out.println("FileReader Time: " + (System.currentTimeMillis() - start));

        // InputStreamReader
        start = System.currentTimeMillis();
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
        while (isr.read() != -1);
        isr.close();
        System.out.println("InputStreamReader Time: " + (System.currentTimeMillis() - start));
    }
}
