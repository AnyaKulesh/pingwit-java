package org.example.homework.lesson4;
/*
Task 3
Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99 (1, 99 - числа пользователя)
 */

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        int min = getNumber("Enter min number");
        int max = getNumber(" Enter max number");
        printOddSum(min, max);

    }

    static int getNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }

    //форматируй код!
    static void printOddSum(int min, int max) {
        int sum = calculateOddSum(min, max);
        System.out.println(sum);
    }

    static int calculateOddSum(int min, int max) {
        int sum = 0;
        if (min % 2 == 0) {
            min++;
        }
        while (min <= max) {
            sum += min;
            min += 2;
        }
        return sum;
    }
}

