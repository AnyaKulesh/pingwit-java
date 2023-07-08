package org.example.homework.lesson15.task1;

import java.util.Scanner;

/*
Task 1
Создайте метод, который принимает целочисленный параметр и
возвращает логическое значение, указывающее, является ли число
простым или нет. Если параметр меньше или равен нулю, создайте исключение
IllegalArgumentException.

 */
public class PrimeNumber {
    public static void main(String[] args) throws PrimeNumberException {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = isNumberPrime(number);
        System.out.println(isPrime);
    }

    public static boolean isNumberPrime(int num) throws PrimeNumberException {
        if (num <= 0) {
            throw new PrimeNumberException("The number is less than 0");
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
