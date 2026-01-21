package PersonalisedMealPlanGenerator;

public class Meal<T extends MealPlan> {

    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }

    public void displayMeal() {
        System.out.println("Meal Type: " + mealPlan.getMealType() +
                ", Calories: " + mealPlan.getCalories());
    }
}
