package org.example.homework.lesson10.task2;

import java.util.Random;

public class Branch {
    private static final int MAX_FRUIT_NUMBER = 7;
    private final int fruitNumber;
    private Branch[] children;//необязательно было делать с чилдренами

    public Branch(Branch[] children) {
        this.children = children;
        this.fruitNumber = new Random().nextInt(MAX_FRUIT_NUMBER);
    }

    public Branch(int fruitNumber) {
        this.fruitNumber = fruitNumber;
    }

    public Branch() {
        this(null);
    }

    public Branch(Branch[] children, int fruitNumber) {
        this.children = children;
        this.fruitNumber = fruitNumber;
    }

    public int getTotalFruitNumber() {
        int totalFruitNumber = fruitNumber;
        if (children != null) {
            for (Branch child : children) {
                totalFruitNumber += child.getTotalFruitNumber();
            }
        }
        return totalFruitNumber;

    }
}
