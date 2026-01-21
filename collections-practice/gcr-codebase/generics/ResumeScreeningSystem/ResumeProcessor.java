package ResumeScreeningSystem;

public class ResumeProcessor {

    public static <T extends JobRole> void evaluateResume(Resume<T> resume) {
        resume.displayResult();
    }
}
