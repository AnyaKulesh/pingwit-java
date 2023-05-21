package org.example.practice.lesson4;

import java.util.Scanner;

/*
Task 3
Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */
//+
public class Multiplication {

    public static void main(String[] args) {
        int a = getNumberFromConsole();
        int b = getNumberFromConsole();

        System.out.println("Check: " + a * b);

        int mult = calculateMultiplication(a, b);
        System.out.println("My mult: " + mult);
    }

    static int getNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number");
        return scanner.nextInt();
    }

    static int calculateAbsoluteValueOfMultiplication(int a, int b) {
        int absa = getAbsoluteValue(a);
        int absb = getAbsoluteValue(b);

        int sum = 0;
        int i = 1;
        while (i <= absb) {
            sum += absa;
            i++;
        }
        return sum;
    }

    static int getAbsoluteValue(int a) {
        if (a < 0) {
            return -a;
        }
        return a;
    }

    static int calculateSignOfMultiplication(int a, int b) {
        if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
            return 1;
        }
        return -1;
    }

    static int calculateMultiplication(int a, int b) {
        int absMult = calculateAbsoluteValueOfMultiplication(a, b);
        int sign = calculateSignOfMultiplication(a, b);

        return absMult * sign;
    }
}
