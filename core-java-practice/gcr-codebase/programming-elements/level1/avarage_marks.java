public class avarage_marks {
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        int total = maths + physics + chemistry;
        double avg = (total / 300.0)*100;

        System.out.println("Sam’s average mark in PCM is "+avg);
    }
}
