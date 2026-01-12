//Online Examination System
//
//Real Scenario : Students take exams online, submit answers, and receive results.Key Features (CRUD)
//Exam creation
//Student enrollment
//Answer submission
//Result generation
//Concepts Used
//OOP: Exam, Question, Student
//Interface: EvaluationStrategy
//Polymorphism: Objective vs Descriptive evaluation
//Exception Handling: ExamTimeExpiredException

package onlineExaminationSystem;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Question q1 = new Question("Final keyword is used for\n1.Stop initilizing again and again\n2. Initilize\n3. Static \n4. Java","A");
		Question q2 = new Question("Final keyword id used for\n1.Stop initilizing again and again\n2. Initilize\n3. Static \n4. Java","B");
		Question q3 = new Question("Final keyword id used for\n1.Stop initilizing again and again\n2. Initilize\n3. Static \n4. Java","C");
		Question q4 = new Question("Final keyword id used for\n1.Stop initilizing again and again\n2. Initilize\n3. Static \n4. Java","D");
		Question q5 = new Question("Final keyword id used for\n1.Stop initilizing again and again\n2. Initilize\n3. Static \n4. Java","A");
		
		Exam e = new Exam("Java",234);
		e.addQuestions(q1);
		e.addQuestions(q2);
		e.addQuestions(q3);
		e.addQuestions(q4);
		e.addQuestions(q5);
		
		System.out.println("Question added successfully !!!");
		
		System.out.println("Enter name :");
		String name = input.next();
		System.out.println("Enter Roll no :");
		int rollNo = input.nextInt();
		
		Student s = new Student(rollNo,name);
		e.startExam(s);
	}

}
