
import java.io.*;

public class InputStreamReaderToFile {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = new FileWriter("output.txt");
        String line;
        while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
            fw.write(line + "\n");
        }
        fw.close();
    }
}
