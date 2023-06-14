package org.example.homework.lesson9.task1;

public class Main {
    public static void main(String[] args) {
        Computer[] comp = {
                new Acer(),
                new Asus(),
                new Sony()

        };
        for (Computer a : comp) {
            a.turnOn();
            a.turnOff();
            a.reset();
        }
    }
}
