package ResumeScreeningSystem;

public class SoftwareEngineer extends JobRole {

    public SoftwareEngineer() {
        this.roleName = "Software Engineer";
    }

    @Override
    public boolean isQualified(int experience, int skillScore) {
        return experience >= 2 && skillScore >= 70;
    }
}
