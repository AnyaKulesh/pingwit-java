package org.example.homework.lesson9.task2;

public class TownHouse extends House {
    private Heating heating;

    public TownHouse(int floorNumber, int tenants, Heating heating) {
        super(floorNumber, tenants);
        this.heating = heating;
    }

    @Override
    public void turnOnHeating() {
        System.out.println("Turn on " + heating + " heating");
    }
}
