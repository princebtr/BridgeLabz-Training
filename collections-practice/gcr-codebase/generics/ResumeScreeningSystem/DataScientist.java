package ResumeScreeningSystem;

public class DataScientist extends JobRole {

    public DataScientist() {
        this.roleName = "Data Scientist";
    }

    @Override
    public boolean isQualified(int experience, int skillScore) {
        return experience >= 3 && skillScore >= 75;
    }
}
