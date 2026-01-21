package UniversityCourseManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class UniversityDemo {

    public static void main(String[] args) {

        Course<ExamCourse> math =
                new Course<>("Mathematics", "Science", new ExamCourse());

        Course<AssignmentCourse> cs =
                new Course<>("Data Structures", "Computer Science", new AssignmentCourse());

        Course<ResearchCourse> phd =
                new Course<>("AI Research", "Computer Science", new ResearchCourse());

        math.displayCourse();
        math.conductEvaluation();

        cs.displayCourse();
        cs.conductEvaluation();

        phd.displayCourse();
        phd.conductEvaluation();

        System.out.println("\n--- All Course Evaluations ---");

        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(new ExamCourse());
        allCourses.add(new AssignmentCourse());
        allCourses.add(new ResearchCourse());

        CourseManager.displayAllCourses(allCourses);
    }
}
