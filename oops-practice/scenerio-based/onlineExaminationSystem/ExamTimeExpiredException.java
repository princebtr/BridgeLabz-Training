package onlineExaminationSystem;

public class ExamTimeExpiredException extends RuntimeException{
	public ExamTimeExpiredException(String message) {
		super(message);
	}
}
