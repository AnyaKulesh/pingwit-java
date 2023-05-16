package org.example.lesson3;
/*
Task 3
Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */
public class Multiplication {
    public static void main(String[] args) {
        int a = 28;
        int b = 9;
        System.out.println(a * b);

        int sum = 0;
        for (int i = 1; i <= b; i++) {
            sum += a;
        }

        System.out.println(sum);
    }
}
