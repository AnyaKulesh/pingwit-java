package org.example.homework.lesson9.task2;

/*
Task 2(abstract class)
Есть два типа домов - городская многоэтажка и загородный дом.
У каждого типа дома есть методы "получить кол-во этажей", "включить отопление",
"получить кол-во жильцов".
Есть каталог домов (например класс, внутри которого какой-то массив).
Создайте каталог и поместите туда несколько домов.
 */
public abstract class House {
    private int floorNumber;
    private int tenants;

    public House(int floorNumber, int tenants) {
        this.floorNumber = floorNumber;
        this.tenants = tenants;
    }

    public abstract void turnOnHeating();

    public int getFloorNumber() {
        return floorNumber;
    }

    public int getTenants() {
        return tenants;
    }
}
