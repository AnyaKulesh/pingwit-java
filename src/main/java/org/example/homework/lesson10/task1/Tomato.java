package org.example.homework.lesson10.task1;

public class Tomato extends Vegetable {
    private static final double CALORIES_PER_100_GRAM = 20;

    public Tomato(int weight) {
        super(CALORIES_PER_100_GRAM, weight, Vegetables.TOMATO);
    }
}
