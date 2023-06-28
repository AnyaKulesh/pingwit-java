package org.example.homework.lesson13.task2;

import java.util.Objects;

public class Apple extends Product{
    private Colour colour;

    public Apple(String name, double price, int quantity, Colour colour) {
        super(name, price, quantity);
        this.colour = colour;
    }


    @Override
    public String toString() {
        return "Apple{" +
                "colour='" + colour + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Apple apple = (Apple) o;
        return Objects.equals(colour, apple.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), colour);
    }
}
