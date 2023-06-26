package org.example.homework.lesson10.task2;

public class MonkeyManager {
    //еще можно метод с несколькими деревьями для 1-й обезьяны
    public void countFruitsByMonkey(Monkey monkey, Tree tree) {
        Integer numFruits = monkey.countFruits(tree);
        System.out.println(monkey.getName() + " : " + numFruits + " on " + tree.getType() + " tree");
    }
}
