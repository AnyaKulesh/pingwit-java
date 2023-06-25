package org.example.homework.lesson10.task1;

import java.util.Arrays;

public class Salad {
    private final Vegetable[] vegetables;

    public Salad(Vegetable[] vegetables) {
        this.vegetables = vegetables;
    }

    @Override
    public String toString() {
        return "Salad{" +
                "vegetables=" + Arrays.toString(vegetables) +
                '}';
    }

    public int getWeight() {
        int totalWeight = 0;
        for (Vegetable veg : vegetables) {
            totalWeight += veg.getWeight();
        }
        return totalWeight;
    }

    public double getCalories() {
        double totalCalories = 0;
        for (Vegetable veg : vegetables) {
            totalCalories += veg.getCalories();
        }
        return totalCalories;
    }

}
