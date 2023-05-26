package org.example.practice.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length ");
        int length = scanner.nextInt();
        int[] array = initArray(length);
        int sum = countSum(array) ;
        System.out.println(sum);
        System.out.println(Arrays.toString(array));
    }

    static int[] initArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
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
}

