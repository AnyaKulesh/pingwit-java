package org.example.lesson2.task1;

public class DifferentTypesOperations {
    public static void main(String[] args) {
        int firstInt = 133;
        float secondFloat = 8.55F;
        float sum = firstInt + secondFloat;
        float multiplication = firstInt * secondFloat;
        float remainder = firstInt % secondFloat;
        System.out.println(firstInt + " + " + secondFloat + " = " + sum);
        System.out.println(firstInt + " * " + secondFloat + " = " + multiplication);
        System.out.println(firstInt + " % " + secondFloat + " = " + remainder);
    }
}
