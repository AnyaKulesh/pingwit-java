package org.example.homework.lesson10.task1;
//ок
public class Main {
    public static void main(String[] args) {
        Vegetable[] vegetables = {
                new Pepper(35),
                new Cucumber(23),
                new Cucumber(30),
                new Tomato(45),
                new Tomato(52)
        };
        Salad salad = new Salad(vegetables);
        System.out.println("Salad weight - " + salad.getWeight());
        System.out.println("Salad calories - " + salad.getCalories());
        System.out.println("Ingredients - " + salad);
    }
}
