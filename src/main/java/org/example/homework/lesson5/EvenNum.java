package org.example.homework.lesson5;

import java.util.Arrays;
import java.util.Scanner;

/*
Task 6
Есть массив чисел. Необходимо создать другой массив содержащий только четные элементы из первого

 */
public class EvenNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length");
        int length = scanner.nextInt();
        int[] array = new int[length];
        //отдельный метод
        System.out.println("Enter element array");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int[] secondArray = extractEvens(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(secondArray));
    }

    static int[] extractEvens(int[] input) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                count++;
            }
        }
        int[] output = new int[count];
        int k = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                output[k] = input[i];
                k++;
            }
        }
        return output;
    }
}
