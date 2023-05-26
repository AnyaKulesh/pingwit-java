package org.example.practice.lesson5;

import javax.sound.sampled.LineUnavailableException;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] a = {5, 9, 1, 11, 8, 6};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int element : a) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
