package org.example.Day01.problem4;


public class MealPlanGenerator {
    public static <T extends MealPlan> void generatePlan(T mealPlan) {
        Meal<T> meal = new Meal<>(mealPlan);
        System.out.println(meal.generateMealPlan());
    }
}