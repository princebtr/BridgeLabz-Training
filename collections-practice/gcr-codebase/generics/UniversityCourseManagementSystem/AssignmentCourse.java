package UniversityCourseManagementSystem;

public class AssignmentCourse extends CourseType {

    public AssignmentCourse() {
        this.evaluationMethod = "Assignments";
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluation via assignments and coursework.");
    }
}
