package org.example.practice.lesson9.computers;

public class Main {

    public static void main(String[] args) {
        IComputer[] computers = {
                new MacBook(12345, "MacBook Pro Max"),
                new MacBook(1432, "MacBook Air"),
                new Asus(OperatingSystem.WINDOWS, 423423, "ZenBook")
        };

        for (IComputer computer : computers) {
            computer.turnOff();
            computer.reset();
            computer.turnOn();
            computer.reset();
            computer.turnOff();
        }
    }
}
