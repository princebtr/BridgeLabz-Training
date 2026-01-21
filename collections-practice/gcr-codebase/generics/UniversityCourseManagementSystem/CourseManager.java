package UniversityCourseManagementSystem;
import java.util.List;

public class CourseManager {

    public static void displayAllCourses(List<? extends CourseType> courseTypes) {
        for (CourseType type : courseTypes) {
            System.out.println("Evaluation Method: " + type.getEvaluationMethod());
            type.evaluate();
        }
    }
}
