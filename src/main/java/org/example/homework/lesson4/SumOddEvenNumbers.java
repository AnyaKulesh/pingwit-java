package org.example.homework.lesson4;

import java.util.Scanner;

/*
Task 4
Даны числа от 0 до 100(числа пользователя).
- Посчитать сумму четных и вывести на экран
- Посчитать сумму нечетных и вывести на экран
- Найти общую сумму всех чисел
 */
public class SumOddEvenNumbers {
    public static void main(String[] args) {
        int min = getNumber(" Enter min number ");
        int max = getNumber(" Enter max number");
        printOddEvenSum(min, max);
    }

    static int getNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }
    //printOddEvenSum -> printTotalSum. Либо каждый метод для своей суммы. А так супер!
    static void printOddEvenSum(int min, int max) {
        int evenSum = 0;
        int oddSum = 0;

        while (min <= max) {
            if (min % 2 == 0) {
                evenSum += min;
            } else {
                oddSum += min;
            }
            min++;
        }
        System.out.println("even sum  = " + evenSum);
        System.out.println("odd sum   = " + oddSum);
        System.out.println("total sum = " + (evenSum + oddSum));
    }
}

