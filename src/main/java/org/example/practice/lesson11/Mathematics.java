package org.example.practice.lesson11;

public class Mathematics {

    private static Mathematics instance = null;
    private static int count = 0;
    {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static Mathematics getInstance() {
        if (instance == null) {
            instance = new Mathematics();
        }
        return instance;
    }
    private Mathematics() {
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }
}
