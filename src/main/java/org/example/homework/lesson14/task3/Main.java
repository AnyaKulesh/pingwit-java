package org.example.homework.lesson14.task3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();

        Gladiator user = new UserGladiator(name);
        Gladiator computer = new AIGladiator();

        Battle battle = new Battle(user, computer);
        battle.fight();
    }
}
