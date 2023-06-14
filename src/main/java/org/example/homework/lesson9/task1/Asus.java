package org.example.homework.lesson9.task1;

public class Asus implements Computer {
    @Override
    public void turnOn() {
        System.out.println("Turn on Asus");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off Asus");
    }

    @Override
    public void reset() {
        System.out.println("Reset Asus");
    }
}
