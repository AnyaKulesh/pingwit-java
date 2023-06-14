package org.example.homework.lesson9.task2;

public class Main {
    public static void main(String[] args) {
        CatalogHouse houses = new CatalogHouse(
                new CityHouse(6, 50, "Minsk", 3),
                new TownHouse(2, 3, Heating.WOOD),
                new TownHouse(3, 5, Heating.GAS)
        );
        for (House house : houses.getHouses()) {
            house.turnOnHeating();
            System.out.println("Number of tenants = " + house.getTenants());
            System.out.println("Number of floors = " + house.getFloorNumber());
        }
    }
}
