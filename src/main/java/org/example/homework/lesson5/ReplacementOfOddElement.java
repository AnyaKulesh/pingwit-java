package org.example.homework.lesson5;

import java.util.Arrays;
import java.util.Scanner;

/*
Task 3
Есть массив чисел. Заменить каждый нечетный элемент массива на 0.
 */
public class ReplacementOfOddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length");
        int length = scanner.nextInt();
        int[] array = initArray(length);
        System.out.println(Arrays.toString(array));
        replaceOddNum(array);
        System.out.println(Arrays.toString(array));
    }

    static int[] initArray(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[length];
        System.out.println("Enter array element");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    static void replaceOddNum(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
        }
    }
}
