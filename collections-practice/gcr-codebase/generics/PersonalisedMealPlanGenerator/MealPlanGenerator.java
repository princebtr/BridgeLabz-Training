package PersonalisedMealPlanGenerator;

public class MealPlanGenerator {

    public static <T extends MealPlan> Meal<T> generateMealPlan(T plan) {
        if (plan.getCalories() <= 0) {
            throw new IllegalArgumentException("Invalid meal plan");
        }
        return new Meal<>(plan);
    }
}
