public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "Java is very easy";
        String oldWord = "easy";
        String newWord = "powerful";

        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {
            if (word.equals(oldWord))
                result += newWord + " ";
            else
                result += word + " ";
        }

        System.out.println("Modified Sentence: " + result.trim());
    }
}
