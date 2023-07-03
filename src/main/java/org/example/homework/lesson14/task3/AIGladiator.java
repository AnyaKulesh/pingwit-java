package org.example.homework.lesson14.task3;

import java.util.Random;

public class AIGladiator extends Gladiator {

    public static final String[] NAMES = {"John", "Vasilisa", "Lev", "Anya", "Sasha"};
    private static final Random random = new Random();

    public AIGladiator() {
        super(NAMES[random.nextInt(NAMES.length)]);
    }

    @Override
    public BodyArea attack() {
        return chooseBodyArea();
    }

    @Override
    public BodyArea defend() {
        return chooseBodyArea();
    }

    private BodyArea chooseBodyArea() {
        int number = random.nextInt(1, 4);
        return getBodyArea(number);
    }
}
