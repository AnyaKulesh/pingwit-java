package org.example.practice.lesson9.computers;

public class MacBook extends Computer {

    public MacBook(long serialNumber, String model) {
        super(OperatingSystem.MAC_OS, serialNumber, "Apple", model);
    }
}
