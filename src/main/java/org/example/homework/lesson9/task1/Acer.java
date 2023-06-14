package org.example.homework.lesson9.task1;

public class Acer implements Computer {
    @Override
    public void turnOn() {
        System.out.println("Turn On Acer");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn Off Acer");
    }

    @Override
    public void reset() {
        System.out.println("Reset Acer");
    }
}
