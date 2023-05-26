package org.example.homework.lesson4;

import java.util.Scanner;

/*

Task 5 *
При старте программы пользователя просят ввести время в пути в секундах.
Затем, при помощи цикла while выводить на экран извилистую дорогу.

Определить время старта программы можно при помощи System.currentTimeMillis() - это вернет вам текущее время в миллисекундах.
 */

public class Road {
    public static void main(String[] args) {

        double timeLimit = getTimeLimit();

        double startTime = currentTimeInSeconds();
        while (currentDuration(startTime) < timeLimit) {
            drawRoad();
        }
    }

    static double getTimeLimit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter time in seconds ");
        return scanner.nextDouble();
    }

    static double currentTimeInSeconds() {
        long startTimeMillis = System.currentTimeMillis();
        return startTimeMillis / 1000d;
    }

    static double currentDuration(double start) {
        return currentTimeInSeconds() - start;
    }

    static void drawRoad() {
        int roadLength = 5;
        int i = 5;
        while (i >= 1) {
            printPartOfRoad(roadLength - i);
            i--;
        }
        i = 1;
        while (i <= roadLength) {
            printPartOfRoad(roadLength - i);
            i++;
        }
    }

    static void printPartOfRoad(int numberOfSpaces) {
        String road = "||   |   ||";
        String line = "";
        for (int q = 1; q <= numberOfSpaces; q++) {
            line += ' ';
        }
        line += road;
        System.out.println(line);
    }
}
