package org.example.practice.lesson9.computers;

public abstract class Computer implements IComputer {

    private boolean isOn;

    private OperatingSystem operatingSystem;
    private long serialNumber;
    private String brand;
    private String model;

    public Computer(OperatingSystem operatingSystem, long serialNumber, String brand, String model) {
        this.operatingSystem = operatingSystem;
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        if (isOn) {
            System.out.println(this.toString() + " is already on");
        } else {
            System.out.println(this.toString() + " turned on");
            isOn = true;
        }
    }

    @Override
    public void turnOff() {
        if (isOn) {
            System.out.println(this.toString() + " turned off");
            isOn = false;
        } else {
            System.out.println(this.toString() + " is already off");
        }
    }

    @Override
    public void reset() {
        if (isOn) {
            System.out.println(this.toString() + " reset");
        } else {
            System.out.println(this.toString() + " is off and cannot be reset");
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "serialNumber=" + serialNumber +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}
