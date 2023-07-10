package org.example.homework.lesson15.task2;

import java.util.Scanner;

/*
Task 2
Напишите программу, которая пытается разделить два числа (их вводит пользователь),
но перехватывает и обрабатывает исключение ArithmeticException,
которое будет выдано, если знаменатель равен нулю.
 */
//форматируй код
public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        double denominator = scanner.nextDouble();
        Double division = safeDivide(number,denominator);
        System.out.println(division);

    }

    public static Double safeDivide(double number, double denominator){
        Double division = null;
        try {
            division = divide(number, denominator);
        }catch (DivisionException e){
            System.out.println(e.getMessage());
        }
        return division;
    }

    public static double divide(double number, double denominator) {
        if (denominator == 0) {
            throw new DivisionException("Division by 0 is impossible");
        }
        return number / denominator;
    }
}
