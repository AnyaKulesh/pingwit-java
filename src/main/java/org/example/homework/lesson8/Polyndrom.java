package org.example.homework.lesson8;

import java.util.Scanner;
/*
Task 2
Написать программу, которая определяет, является ли слово палиндромом.
(Палиндром - это слово, которое читается одинаково слева направо и справа налево. Примеры: "топот", "шалаш", "А роза упала на лапу Азора".)
Для работы со строками вам пригодится это - https://metanit.com/java/tutorial/7.1.php
 */
public class Polyndrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter string");
        String string = scanner.next();
        boolean polyndrom = isPolyndrom(string);
        System.out.println(polyndrom);
    }

    private static boolean isPolyndrom(String str) {
        char[] chars = str.replace(" ", "")
                .toLowerCase()
                .toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
