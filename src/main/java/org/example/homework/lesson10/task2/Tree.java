package org.example.homework.lesson10.task2;

/*
Task 2
Есть 2 дерева, на одном растут бананы, на другом - кокосы. Дерево состоит из веток (само дерево - главная ветка).
На ветке могут быть фрукты (т.е. бананы или кокосы).
Для каждой ветки при ее создании можно задать кол-во фруктов, а если не задавать - то рандом.
Есть 3 обезьяны, одна умеет считать кокосы, вторая бананы, а третья - и кокосы и бананы
Есть класс - MonkeyManager, в котором есть метод - попросить любую обезьяну посчитать фрукты на любом дереве
 */
public abstract class Tree {
    private final Fruits type;
    private final Branch trunk;

    public Tree(Fruits type, Branch trunk) {
        this.type = type;
        this.trunk = trunk;
    }

    public Fruits getType() {
        return type;
    }

    public Branch getTrunk() {
        return trunk;
    }

}
