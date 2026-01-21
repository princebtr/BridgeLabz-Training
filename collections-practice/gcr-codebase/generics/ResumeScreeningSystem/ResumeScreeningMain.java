package ResumeScreeningSystem;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningMain {

    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
                new Resume<>("Alice", 3, 80, new SoftwareEngineer());

        Resume<DataScientist> r2 =
                new Resume<>("Bob", 2, 78, new DataScientist());

        Resume<ProductManager> r3 =
                new Resume<>("Charlie", 6, 70, new ProductManager());

        ResumeProcessor.evaluateResume(r1);
        ResumeProcessor.evaluateResume(r2);
        ResumeProcessor.evaluateResume(r3);

        System.out.println("\n--- Screening Pipeline ---");

        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        ScreeningPipeline.processResumes(roles);
    }
}
