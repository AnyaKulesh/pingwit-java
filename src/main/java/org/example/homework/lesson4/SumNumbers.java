package org.example.homework.lesson4;

import java.util.Scanner;

/*
Task 2
Вычислить: 1+2+4+8+...+256
 */
public class SumNumbers {

    public static void main(String[] args) {
        int limitPower = 10;
        int maxPower = getMaxPower(limitPower);
        printSum(maxPower, limitPower);
    }

    public static void printSum(int maxPower, int limitPower) {
        if (maxPower <= limitPower && maxPower > 0) {
            int sum = calculateSum(maxPower);
            System.out.println(sum);
        } else {
            System.out.println("Don't cheat please");
        }
    }

    public static int getMaxPower(int limitPower) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter power of two, but less than " + limitPower);
        int maxPower = scan.nextInt();
        return maxPower;
    }

    public static int calculateSum(int maxPower) {
        int i = 1;
        int sum = i;
        double maxNumber = Math.pow(2, maxPower);
        System.out.println("Max. number in this row is " + maxNumber);
        System.out.print(i + "+");
        while (i < maxNumber) {
            i *= 2;
            sum += i;
            if (i == maxNumber) {
                System.out.print(i + "=");
            } else {
                System.out.print(i + "+");
            }
        }
        return sum;
    }
}

