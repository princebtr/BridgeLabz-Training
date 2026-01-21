package ResumeScreeningSystem;
import java.util.List;

public class ScreeningPipeline {

    public static void processResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Processing resumes for role: " + role.getRoleName());
        }
    }
}
