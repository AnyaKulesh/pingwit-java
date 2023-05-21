package org.example.homework.lesson4;

import java.util.Scanner;

/*
Task 2
Напишите программу вывода всех четных чисел от 2 до 100 включительно (2, 100 - числа пользователя)
 */
public class EvenNumbers {
    public static void main(String[] args) {
        int i = getNumber("Enter min number");;
        int b = getNumber("Enter max number");
        printEvenNumbers(i, b);

    }
    static int getNumber(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }
    static void  printEvenNumbers(int i, int b){
        if ( i % 2 != 0) {
            i++;
        }
        while (i <= b) {
            System.out.println(i);
            i += 2;
        }
    }
}
