package org.example.lesson3;
/*
Task 4
Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
 */
//+
public class Inches {
    public static void main(String[] args) {
        double myDouble = 2.54;
        for (int inches = 1; inches <= 20; inches++) {
            System.out.println(inches + " inch = " + inches * myDouble + " cm ");
        }
    }
}
