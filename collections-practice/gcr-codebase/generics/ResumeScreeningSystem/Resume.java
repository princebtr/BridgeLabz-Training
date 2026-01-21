package ResumeScreeningSystem;

public class Resume<T extends JobRole> {

    private String candidateName;
    private int experience;
    private int skillScore;
    private T jobRole;

    public Resume(String candidateName, int experience, int skillScore, T jobRole) {
        this.candidateName = candidateName;
        this.experience = experience;
        this.skillScore = skillScore;
        this.jobRole = jobRole;
    }

    public boolean screen() {
        return jobRole.isQualified(experience, skillScore);
    }

    public void displayResult() {
        System.out.println(
            "Candidate: " + candidateName +
            ", Role: " + jobRole.getRoleName() +
            ", Result: " + (screen() ? "Selected" : "Rejected")
        );
    }
}
