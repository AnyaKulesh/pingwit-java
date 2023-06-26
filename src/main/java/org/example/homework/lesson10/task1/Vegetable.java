package org.example.homework.lesson10.task1;

/*
Task 1
Есть Абстрактный класс Овощ (или интерфейс?) Надо сделать салат.
У каждого овоща есть граммовка и калорийность. Надо сделать салат и посчитать итоговое количество калорий и грамм.
 */
public abstract class Vegetable {
    private final double caloriesPer100Gram;//название не очень. Просто kkal
    private final int weight;
    private final Vegetables name;

    public Vegetable(double caloriesPer100Gram, int weight, Vegetables name) {
        this.caloriesPer100Gram = caloriesPer100Gram;
        this.weight = weight;
        this.name = name;
    }

    public double getCalories() {
        return caloriesPer100Gram * weight / 100;// 100 - константа!
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "caloriesPer100Gram=" + caloriesPer100Gram +
                ", weight=" + weight +
                ", name=" + name +
                '}';
    }
}
