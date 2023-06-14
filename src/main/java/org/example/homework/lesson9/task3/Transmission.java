package org.example.homework.lesson9.task3;

public class Transmission {

    private static final int MIN_GEAR = 0;
    private static final int MAX_GEAR = 7;
    private int gear;

    public int getGear() {
        return gear;
    }

    public void shiftUp() {
        if (gear < MAX_GEAR) {
            gear++;
        }
    }

    public void shiftDown() {
        if (gear > MIN_GEAR) {
            gear--;
        }
    }
}
