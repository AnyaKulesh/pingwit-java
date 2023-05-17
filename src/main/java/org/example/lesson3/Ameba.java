package org.example.lesson3;
/*
Task 1
Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

 */
public class Ameba {
    public static void main(String[] args) {
        int amebaCount = 1;
        for (int i = 3; i <= 24; i +=3) {
            amebaCount *= 2;
            System.out.println(amebaCount);
        }
//лишняя строка
    }
}
