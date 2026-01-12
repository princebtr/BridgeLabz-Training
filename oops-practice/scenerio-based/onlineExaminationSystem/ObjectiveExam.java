package onlineExaminationSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectiveExam extends Exam {
	Scanner input = new Scanner(System.in);
	private static List<Question> queList = new ArrayList<>();
	int marks = 0;
	
	public ObjectiveExam(String subject, int subCode) {
		super(subject, subCode);
	}
	
	public void addQuestions(Question q) {
		queList.add(q);
	}

	public void startExam(Student s) {
//		int marks = 0;
//		System.out.println("Welcome to Exam of "+subject+" ("+getsubCode+")");
		for(Question q : queList) {
			System.out.println();
			System.out.println(q.getQuestion());
			System.out.println("Select Option ");
			String ans = input.next();
			if(ans.toLowerCase().equals(q.getAnswer().toLowerCase())) {
				marks++;
				System.out.println("Correct Answer");
			} else {
				System.out.println("Wrong Answer");
			}
		}
		System.out.println("Marks Obtained : "+marks);
	}
}
