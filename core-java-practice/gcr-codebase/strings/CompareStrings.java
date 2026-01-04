public class CompareStrings {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "banana";

        int i = 0;
        while (i < s1.length() && i < s2.length()) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (s1.charAt(i) < s2.charAt(i))
                    System.out.println("apple comes before banana");
                else
                    System.out.println("banana comes before apple");
                return;
            }
            i++;
        }

        if (s1.length() < s2.length())
            System.out.println("apple comes before banana");
        else
            System.out.println("banana comes before apple");
    }
}
