package onlineExaminationSystem;

public class Question {
	private String question;
	private String answer;
	private int qNo;
	private static int count = 0;
	public Question(String question, String answer) {
		this.qNo = count++;
		this.question = question;
		this.answer = answer;
	}
	public String getQuestion() {
		return question;
	}
	public String getAnswer() {
		return answer;
	}
	public int getQNo() {
		return qNo;
	}
}
