package org.example.homework.lesson9.task3;

/*
Task 3*
Есть класс автомобиль. У автомобиля есть коробка передач и мотор.
У мотора должны быть методы “заглушить мотор” и “завести мотор”.
Если попробовать завести работающий мотор, то вывести на экран, что мотор уже работает.
Если заглушить не работающий мотор, то вывести на экран, что мотор уже заглушен

У коробки передач должны быть методы “переключить передачу выше” и “переключить передачу ниже”.
Нельзя понизить передачу ниже 0 и повысить больше 7.

Машина должна уметь ездить, т.е. надо завести мотор, включить первую передачу и нажать газ.
Машина не может поехать, если не заведен мотор.
Когда машина едет, то пускай выведет на экран текущую скорость

Скорость = текущая_передача * 20

P.S. имена методов условные, ваши могут отличаться в названии.
Помните, что поля класса должны быть приватными
 */
public class Car {
    private static final int GEAR_SPEED = 20;
    private Engine engine;
    private Transmission transmission;
    private String model;

    public Car(long engineSerialNumber, String model) {
        this.engine = new Engine(engineSerialNumber);
        this.transmission = new Transmission();
        this.model = model;
    }

    public void startMovement() {
        if (transmission.getGear() == 0) {
            engine.startEngine();
            transmission.shiftUp();
        } else {
            System.out.println("Gear is not 0");
        }
    }

    public void accelerate() {
        if (engine.getState()) {
            transmission.shiftUp();
        }
    }

    public void pushBreak() {
        if (engine.getState()) {
            transmission.shiftDown();
        }
    }

    public int getSpeed() {
        return transmission.getGear() * GEAR_SPEED;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
