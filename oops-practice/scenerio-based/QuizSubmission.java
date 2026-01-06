//Problem Statement: Online Quiz Platform – Result Processor
//Scenario: A quiz platform processes user answers and compares them to correct answers.
//Problem Requirements:
//● Use String[] for correct answers and user answers.
//● Use methods to compare answers, calculate scores, and return grade.
//● Store scores of multiple users in a List<Integer>.
//● Validate input (length mismatch) and throw an    InvalidQuizSubmissionException.

package oops;
import java.util.*;
public class QuizSubmission {
	List<Integer> scores;
    String[] questions = {
        "1. Which keyword is used to inherit a class in Java?\nA) this\nB) super\nC) extends\nD) implements",

        "2. Which of the following is not a primitive data type?\nA) int\nB) float\nC) String\nD) char",

        "3. What is the size of int data type in Java?\nA) 2 bytes\nB) 4 bytes\nC) 8 bytes\nD) Depends on OS",

        "4. Which method is the entry point of a Java program?\nA) start()\nB) run()\nC) main()\nD) init()",

        "5. Which keyword is used to create an object in Java?\nA) class\nB) new\nC) object\nD) create",

        "6. Which of these is used to handle exceptions in Java?\nA) try-catch\nB) throw-throws\nC) final\nD) Both A and B",

        "7. Which collection does not allow duplicate elements?\nA) List\nB) ArrayList\nC) Set\nD) Map",

        "8. Which access modifier makes a member visible only within the same class?\nA) public\nB) protected\nC) private\nD) default",

        "9. Which keyword is used to prevent method overriding?\nA) static\nB) final\nC) abstract\nD) private",

        "10. Which of the following is not a Java feature?\nA) Object-Oriented\nB) Platform Independent\nC) Use of pointers\nD) Secure"
    };

    String[] answers = {"C","C","B","C","B","D","C","C","B","C"};
   
	public boolean compareAnswers(int qNo, String ans) {
		if(answers[qNo].equals(ans)) return true;
		return false;
	}
	
	public int calculateScores(String[] s) {
		scores = new ArrayList<>();
		int marks = 0;
		for(int i=0; i<10; i++) {
			if(compareAnswers(i,s[i].toUpperCase())) marks++;
		}
		scores.add(marks);
		return marks;
	}
	
	public void displayGrades() {
		for(int i=0; i<scores.size(); i++) {
			System.out.println("Score of User "+ (i+1)+" is : "+scores.get(i));
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] ans = new String[10];
		QuizSubmission qs = new QuizSubmission();
		for(int i=0; i<10; i++) {
    		System.out.println(qs.questions[i]);
    		ans[i] = input.next();
    	}
		qs.calculateScores(ans);
		qs.displayGrades();
	}

}
