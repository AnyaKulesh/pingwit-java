package org.example.homework.lesson5;

import java.util.Arrays;

import static java.util.Arrays.sort;

/*
Task 7
Есть целочисленный неотсортированный массив. Отсортируйте его "пузырьком".
Попробуйте сами написать и затем посмотрите реализацию
 */
public class BubbleToSort {
    public static void main(String[] args) {
        int[] arrayToSort = {109, 75, 4, 29, 5, 66, 78, 54, 11};
        sort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));
    }

    static void sort(int[] arrayToSort) {
        boolean needToSort = true;
        while (needToSort) {
            needToSort = sortIteration(arrayToSort);
        }
    }

    static boolean sortIteration(int[] arrayToSort) {
        boolean needToSort = false;
        for (int i = 1; i < arrayToSort.length; i++) {
            if (arrayToSort[i] < arrayToSort[i - 1]) {
                swap(arrayToSort, i, i - 1);
                needToSort = true;
            }
        }
        return needToSort;
    }

    static void swap(int[] arrayToSort, int previous, int current) {
        int temp = arrayToSort[previous];
        arrayToSort[previous] = arrayToSort[current];
        arrayToSort[current] = temp;
    }
}
