import java.io.*;
public class FileCopyUnbuffered {
    public static void main(String[] args) {
        File source = new File("source.txt");
        File destination = new File("destination.txt");
        if (!source.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
