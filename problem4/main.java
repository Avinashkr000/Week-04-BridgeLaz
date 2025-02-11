import org.example.Day01.problem4.HighProteinMeal;
import org.example.Day01.problem4.VeganMeal;
import org.example.Day01.problem4.VegetarianMeal;

import static org.example.Day01.problem4.MealPlanGenerator.generatePlan;

public static void main(String[] args) {
    generatePlan(new VegetarianMeal());
    generatePlan(new VeganMeal());

    generatePlan(new HighProteinMeal());
}
