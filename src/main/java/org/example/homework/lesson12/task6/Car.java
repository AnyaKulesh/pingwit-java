package org.example.homework.lesson12.task6;


public class Car {
    private final String model;//можно как enum
    private final AutoEngine engine;

    public Car(AutoEngine engine, String model) {
        this.engine = engine;
        this.model = model;
    }

    public AutoEngine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
