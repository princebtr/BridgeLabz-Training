package PersonalisedMealPlanGenerator;

public class MealPlannerDemo {

    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal =
                MealPlanGenerator.generateMealPlan(new VegetarianMeal());

        Meal<VeganMeal> veganMeal =
                MealPlanGenerator.generateMealPlan(new VeganMeal());

        Meal<KetoMeal> ketoMeal =
                MealPlanGenerator.generateMealPlan(new KetoMeal());

        Meal<HighProteinMeal> proteinMeal =
                MealPlanGenerator.generateMealPlan(new HighProteinMeal());

        vegMeal.displayMeal();
        veganMeal.displayMeal();
        ketoMeal.displayMeal();
        proteinMeal.displayMeal();
    }
}
