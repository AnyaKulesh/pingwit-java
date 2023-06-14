package org.example.homework.lesson9.task1;

public class Sony implements Computer {
    @Override
    public void turnOn() {
        System.out.println("Turn on Sony");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off Sony");
    }

    @Override
    public void reset() {
        System.out.println("Reset Sony");
    }
}
