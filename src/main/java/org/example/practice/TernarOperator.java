package org.example.practice.lesson3;

public class TernarOperator {
    public static void main(String[] args) {
        int n = -5;

        /*
        String str = null;
        if (n < 0) {
            str = "negative";
        } else {
            str = "positive";
        }
         */

        String str = (n < 0) ? "negative" : "positive";
        System.out.println(str);

        int a = 2;
        int b = 1;
        int c = 5;

        /*
        int max = a < b ? (b < c ? c : b) : (a < c ? c : a);
         */

        int max;
        if (a < b) {
            if (b < c) {
                max = c;
            } else {
                max = b;
            }
        } else {
            if (a < c) {
                max = c;
            } else {
                max = a;
            }
        }

        System.out.println(max);
    }
}
