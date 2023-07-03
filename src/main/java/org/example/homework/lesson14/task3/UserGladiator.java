package org.example.homework.lesson14.task3;

import java.util.Scanner;

public class UserGladiator extends Gladiator {
    public UserGladiator(String name) {
        super(name);
    }

    @Override
    public BodyArea attack() {
        System.out.println("Choose option:");
        System.out.println("1 - hit head");
        System.out.println("2 - hit body");
        System.out.println("3 - hit legs");
        return chooseBodyArea();
    }

    @Override
    public BodyArea defend() {
        System.out.println("Choose option:");
        System.out.println("1 - upper block");
        System.out.println("2 - mid block");
        System.out.println("3 - low block");
        return chooseBodyArea();
    }

    private BodyArea chooseBodyArea() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return getBodyArea(number);
    }
}
