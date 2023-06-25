package org.example.practice.lesson11;

import org.example.homework.lesson10.task1.Cucumber;
import org.example.homework.lesson10.task1.Tomato;
import org.example.homework.lesson10.task1.Vegetable;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {
        int a = 5;
        int b = 7;

        System.out.println("count: " + Mathematics.getCount());

        System.out.println(Mathematics.getInstance().multiplication(a, b));
        System.out.println(Mathematics.getInstance().sum(a, b));

        System.out.println("count: " + Mathematics.getCount());

        Class<Mathematics> mathematicsClass = Mathematics.class;
        Constructor<Mathematics> constructor = mathematicsClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Mathematics math = constructor.newInstance();

        Vegetable vegetable = new Tomato(10);
        System.out.println(vegetable instanceof Vegetable);
        System.out.println(vegetable instanceof Tomato);
        System.out.println(vegetable instanceof Cucumber);
    }
}
