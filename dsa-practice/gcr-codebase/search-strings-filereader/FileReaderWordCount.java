
import java.io.*;

public class FileReaderWordCount {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String word = "java";
        int count = 0;
        String line;

        while ((line = br.readLine()) != null) {
            for (String w : line.split("\\s+")) {
                if (w.equalsIgnoreCase(word)) count++;
            }
        }
        br.close();
        System.out.println("Count: " + count);
    }
}
