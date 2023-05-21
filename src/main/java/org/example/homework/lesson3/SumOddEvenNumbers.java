package org.example.homework.lesson3;
/*
Task 7
Даны числа от 0 до 100.
- Посчитать сумму четных и вывести на экран
- Посчитать сумму нечетных и вывести на экран
- Найти общую сумму всех чисел
 */
//+
public class SumOddEvenNumbers {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= 100; i++) {
            switch (i % 2) {
                case 0:
                    evenSum += i;
                    break;
                case 1:
                    oddSum += i;
                    break;
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
        System.out.println(evenSum + oddSum);
    }
}

