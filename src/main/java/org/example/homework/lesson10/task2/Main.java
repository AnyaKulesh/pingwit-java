package org.example.homework.lesson10.task2;

public class Main {
    public static void main(String[] args) {
        Monkey sasha = new Monkey("Sasha");
        sasha.learn(Fruits.BANANA);
        Monkey anya = new Monkey("Anya");
        anya.learn(Fruits.COCONUT);
        Monkey lev = new Monkey("Lev");
        lev.learn(Fruits.BANANA);
        lev.learn(Fruits.COCONUT);

        Tree bananaTree = new BananaTree(new Branch(new Branch[]{
                new Branch(4),
                new Branch(new Branch[]{
                        new Branch(2)
                }, 1),
                new Branch(new Branch[]{
                        new Branch(1),
                        new Branch(5)
                }, 3)
        }, 0));
        System.out.println("Number of bananas: " + bananaTree.getTrunk().getTotalFruitNumber());

        Tree coconutTree = new CoconutTree(new Branch(new Branch[]{
                new Branch(new Branch[]{
                        new Branch()
                }), new Branch(new Branch[]{
                new Branch(new Branch[]{
                        new Branch()
                })
        })
        }));
        System.out.println("Number of coconuts :" + coconutTree.getTrunk().getTotalFruitNumber());

        MonkeyManager monkeyManager = new MonkeyManager();
        monkeyManager.countFruitsByMonkey(anya, bananaTree);
        monkeyManager.countFruitsByMonkey(anya, coconutTree);
        monkeyManager.countFruitsByMonkey(sasha, bananaTree);
        monkeyManager.countFruitsByMonkey(sasha, coconutTree);
        monkeyManager.countFruitsByMonkey(lev, bananaTree);
        monkeyManager.countFruitsByMonkey(lev, coconutTree);
    }
}
