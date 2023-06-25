package org.example.homework.lesson10.task1;

public class Pepper extends Vegetable {
    private static final double CALORIES_PER_100_GRAM = 18.5;

    public Pepper(int weight) {
        super(CALORIES_PER_100_GRAM, weight, Vegetables.PEPPER);
    }
}
