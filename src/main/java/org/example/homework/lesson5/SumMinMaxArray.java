package org.example.homework.lesson5;

import java.util.Arrays;
import java.util.Scanner;

/*
Task 1
Создать массив из 3 элементов. При помощи класса сканер и пользователя заполнить его.
Вывести сумму, наименьшее и наибольшее из чисел на экран

 */
public class SumMinMaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length");

        int length = scanner.nextInt();
        int[] array = initArray(length);
        int sum = countSum(array);
        printMinMaxNumber(array);//если метод начинается с 'get', то он должен что-то возвращать. Просто переименуй
        System.out.println("sum = " + sum);
        System.out.println(Arrays.toString(array));
    }

    static int[] initArray(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[length];
        System.out.println(" Enter array elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    static int countSum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    static void printMinMaxNumber(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
