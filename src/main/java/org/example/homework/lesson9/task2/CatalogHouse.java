package org.example.homework.lesson9.task2;

public class CatalogHouse {

    private House[] houses;

    public CatalogHouse(House... houses) {
        this.houses = houses;
    }

    public House[] getHouses() {
        return houses;
    }
}
