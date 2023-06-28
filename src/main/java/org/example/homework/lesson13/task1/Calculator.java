package org.example.homework.lesson13.task1;



/*
Task 1
Создайте калькулятор используя ООП.
Есть Calculator c методом

    public double calculate(double num1, double num2, Operation operation) {
        return operation.operate(num1, num2);
    }

и отдельные классы для каждой математической операции (Addition, Subtraction, Multiplication, and Division).
Каждый класс должен иметь метод calculate() который принимает два числа и возвращает результат.

 */

public class Calculator {
    public double calculate(double num1, double num2, Operation operation) {
        return operation.operate(num1, num2);
    }
}