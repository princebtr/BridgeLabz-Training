package UniversityCourseManagementSystem;

public class ExamCourse extends CourseType {

    public ExamCourse() {
        this.evaluationMethod = "Written Examination";
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluation via final written exam.");
    }
}
