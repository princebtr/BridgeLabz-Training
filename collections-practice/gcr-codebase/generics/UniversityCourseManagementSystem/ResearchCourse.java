package UniversityCourseManagementSystem;

public class ResearchCourse extends CourseType {

    public ResearchCourse() {
        this.evaluationMethod = "Research & Thesis";
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluation via research paper and presentation.");
    }
}
