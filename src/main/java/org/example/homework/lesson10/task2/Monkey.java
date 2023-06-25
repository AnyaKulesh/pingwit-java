package org.example.homework.lesson10.task2;

public class Monkey {
    private final String name;
    private final boolean[] knowledge;

    public Monkey(String name) {
        this.name = name;
        this.knowledge = new boolean[Fruits.values().length];
    }

    public String getName() {
        return name;
    }

    public void learn(Fruits fruit) {
        knowledge[getFruitIndex(fruit)] = true;
    }

    public boolean knows(Fruits fruit) {
        return knowledge[getFruitIndex(fruit)];
    }

    public Integer countFruits(Tree tree) {
        if (knows(tree.getType())) {
            return tree.getTrunk().getTotalFruitNumber();
        }
        return null;
    }

    private int getFruitIndex(Fruits fruit) {
        for (int i = 0; i < Fruits.values().length; i++) {
            if (Fruits.values()[i].equals(fruit)) {
                return i;
            }
        }
        return -1;
    }
}
