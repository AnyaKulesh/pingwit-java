package org.example.homework.lesson9.task2;

public class CityHouse extends House {
    private String city;
    private int entranceNumber;

    public CityHouse(int floorNumber, int tenants, String city, int entranceNumber) {
        super(floorNumber, tenants);
        this.city = city;
        this.entranceNumber = entranceNumber;
    }

    @Override
    public void turnOnHeating() {
        System.out.println("Turn on " + Heating.CENTRAL + " heating");
    }
}
