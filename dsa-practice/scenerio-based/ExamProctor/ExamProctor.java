package ExamProctor;
import java.util.*;

// Exam system class
class ExamProctor {

    // Stack to track navigation
    private Stack<Integer> navigationStack = new Stack<>();

    // Map to store answers
    private Map<Integer, String> answerMap = new HashMap<>();

    // Correct answers
    private Map<Integer, String> correctAnswers = new HashMap<>();

    public ExamProctor() {
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
    }

    // Navigate to a question
    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    // Store answer
    public void submitAnswer(int questionId, String answer) {
        answerMap.put(questionId, answer);
        System.out.println("Answer saved for Question " + questionId);
    }

    // Evaluate score
    public int evaluateScore() {
        int score = 0;

        for (int qId : correctAnswers.keySet()) {
            if (correctAnswers.get(qId).equals(answerMap.get(qId))) {
                score++;
            }
        }
        return score;
    }

    // Submit exam
    public void submitExam() {
        System.out.println("Submitting exam...");
        System.out.println("Final Score: " + evaluateScore());
    }
}
