
public class LinearSearchProblems {
    public static void main(String[] args) {
        int[] arr = {3, 5, -2, 7};
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) { index = i; break; }
        }
        System.out.println(index);

        String[] sentences = {"I love java", "Python is great"};
        String word = "java";
        String result = "Not Found";
        for (String s : sentences) {
            if (s.contains(word)) {
                result = s;
                break;
            }
        }
        System.out.println(result);
    }
}
