package org.example.homework.lesson10.task1;

public class Cucumber extends Vegetable {
    private static final double CALORIES_PER_100_GRAM = 15;

    public Cucumber(int weight) {
        super(CALORIES_PER_100_GRAM, weight, Vegetables.CUCUMBER);
    }
}
