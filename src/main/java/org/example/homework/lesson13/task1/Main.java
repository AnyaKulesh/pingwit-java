package org.example.homework.lesson13.task1;

public class Main {
    private static final double FIRST_NUMBER = 34;
    public static final double SECOND_NUMBER = 90.67;
    public static final Operation [] OPERATIONS = {
            new Addition(),
            new Division(),
            new Multiplication(),
            new Subtraction()
    };
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        for (Operation operation : OPERATIONS){
            double result = calculator.calculate(FIRST_NUMBER,SECOND_NUMBER, operation);
            System.out.println(result);
        }
    }
}
