package org.example.homework.lesson9.task3;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Car audi= new Car ( 1234,"Audi A5");
        displaySpeed(audi);

        audi.accelerate();
        displaySpeed(audi);

        audi.startMovement();
        displaySpeed(audi);

        for(int i= 0; i<10; i++){
            audi.accelerate();
            displaySpeed(audi);
        }
    }
    public static void displaySpeed(Car car){
        System.out.println(car + " speed = " + car.getSpeed());
    }
}
