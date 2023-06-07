package org.example.homework.lesson8;

import java.util.Locale;
import java.util.Scanner;

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
