package org.example.Day01.problem4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MealPlanTest {

    @Test
    void testVegetarianMealPlan() {
        VegetarianMeal vegetarianMeal = new VegetarianMeal();
        assertEquals("Vegetarian Meal Plan: Salad, Grilled Vegetables,Soup", vegetarianMeal.getMealPlan());
    }

    @Test
    void testVeganMealPlan() {
        VeganMeal veganMeal = new VeganMeal();
        assertEquals("vegetarian Meal Plan : salad, Grilled vegetables, Soup", veganMeal.getMealPlan());
    }

    @Test
    void testHighProteinMealPlan() {
        HighProteinMeal highProteinMeal = new HighProteinMeal();
        assertEquals("High Protein Meal Plan: Steak, Protein Shake, Chickpea Salad", highProteinMeal.getMealPlan());
    }

    @Test
    void testMealWrapperWithVegetarianMeal() {
        Meal<VegetarianMeal> meal = new Meal<>(new VegetarianMeal());
        assertEquals("Vegetarian Meal Plan: Salad, Grilled Vegetables,Soup", meal.generateMealPlan());
    }

    @Test
    void testMealWrapperWithVeganMeal() {
        Meal<VeganMeal> meal = new Meal<>(new VeganMeal());
        assertEquals("vegetarian Meal Plan : salad, Grilled vegetables, Soup", meal.generateMealPlan());
    }

    @Test
    void testMealWrapperWithHighProteinMeal() {
        Meal<HighProteinMeal> meal = new Meal<>(new HighProteinMeal());
        assertEquals("High Protein Meal Plan: Steak, Protein Shake, Chickpea Salad", meal.generateMealPlan());
    }
}