package org.example.homework.lesson14.task3;

import java.util.Arrays;

public class Battle {
    int first = 0;
    private final Gladiator[] gladiators;

    public Battle(Gladiator gladiator1, Gladiator gladiator2) {
        this.gladiators = new Gladiator[]{gladiator1, gladiator2};
    }

    public void fight() {
        System.out.println("=================================================");
        System.out.println(gladiators[0] + " vs " + gladiators[1]);
        System.out.println("Battle started!");

        while (bothGladiatorsAlive()) {
            round();
            first = (first + 1) % 2;
        }

        Gladiator winner = gladiators[0].isDead() ? gladiators[1] : gladiators[0];
        System.out.println("=================================================");
        System.out.println("Winner: " + winner);
    }

    private void round() {
        System.out.println("-------------------------------------------------");
        BodyArea attackBodyArea = getAttacker().attack();
        BodyArea defendBodyArea = getDefender().defend();

        System.out.println(getAttacker().getName() + " attack " + attackBodyArea);
        System.out.println(getDefender().getName() + " defense " + defendBodyArea);

        if (attackBodyArea != defendBodyArea) {
            getDefender().decreaseHealth();
        }
        System.out.println(Arrays.toString(gladiators));
    }

    private Gladiator getAttacker() {
        return gladiators[first];
    }

    private Gladiator getDefender() {
        return gladiators[(first + 1) % 2];
    }

    private boolean bothGladiatorsAlive() {
        return !gladiators[0].isDead() && !gladiators[1].isDead();
    }
}
