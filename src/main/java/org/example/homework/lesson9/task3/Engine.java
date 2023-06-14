package org.example.homework.lesson9.task3;

public class Engine {
    private boolean isOn;
    private final long serialNumber;

    public Engine(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public boolean getState() {
        return isOn;
    }

    public void stopEngine() {
        if (isOn) {
            isOn = false;
        } else {
            System.out.println("Is already stopped.");
        }
    }

    public void startEngine() {
        if (isOn) {
            System.out.println("Is already started.");
        } else {
            isOn = true;
        }
    }
}
