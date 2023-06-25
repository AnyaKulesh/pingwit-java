package org.example.homework.lesson12.task6;

public class AutoEngine {
    private final long serialNumber;
    private String volume;

    public AutoEngine(String volume, long serialNumber) {
        this.volume = volume;
        this.serialNumber = serialNumber;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "AutoEngine{" +
                "serialNumber=" + serialNumber +
                ", volume=" + volume +
                '}';
    }
}
