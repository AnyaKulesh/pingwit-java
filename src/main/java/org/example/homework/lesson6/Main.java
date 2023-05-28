package org.example.homework.lesson6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pet[] otherPets = new Pet[3];
        Pet cat = new Pet("Vasya", 3);
        otherPets[0] = new Pet();
        otherPets[1] = new Pet("John", 4);
        otherPets[2] = cat;

        cat.updateText("Hello from Vasya");

        System.out.println(Arrays.toString(otherPets));
    }
}
