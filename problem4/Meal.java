package org.example.Day01.problem4;

class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public String generateMealPlan() {
        return mealPlan.getMealPlan();
    }
}
