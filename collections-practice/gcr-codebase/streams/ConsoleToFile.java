import java.io.*;
public class ConsoleToFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter("userData.txt")) {
            System.out.print("Enter Name: ");
            String name = br.readLine();
            System.out.print("Enter Age: ");
            int age = Integer.parseInt(br.readLine());
            System.out.print("Favorite Language: ");
            String lang = br.readLine();
            fw.write("Name: " + name + "\nAge: " + age + "\nLanguage: " + lang);
            System.out.println("Data saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
