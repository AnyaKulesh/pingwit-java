package org.example.homework.lesson5;

import java.util.Arrays;
import java.util.Scanner;

/*
Task 4
При помощи двумерного массива вывести на экран таблицу умножения
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 10;//чсисло пользователя
        int m = 10;
        int[][] a = new int[n][m];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i * j;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
