package ResumeScreeningSystem;

public class ProductManager extends JobRole {

    public ProductManager() {
        this.roleName = "Product Manager";
    }

    @Override
    public boolean isQualified(int experience, int skillScore) {
        return experience >= 5 && skillScore >= 65;
    }
}
