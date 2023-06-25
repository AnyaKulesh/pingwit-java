package org.example.homework.lesson12.task6;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car(new AutoEngine("1.4", 1), "Audi A5"),
                new Car(new AutoEngine("1.8", 2), "Skoda Octavia"),
                new Car(new AutoEngine("2.5", 3), "Audi Q8"),
                new Car(new AutoEngine("1.4", 4), "Ford Fiesta")
        };
        CarWarehouse carWarehouse = new CarWarehouse(cars);
        displayCars(carWarehouse, "Before");

        carWarehouse.updateEngineVolumes("1.4", "2.0T");
        carWarehouse.updateEngineVolumes("1.8", "1.8T");
        displayCars(carWarehouse, "After");
    }

    public static void displayCars(CarWarehouse carWarehouse, String message) {
        System.out.println(message);
        for (Car car : carWarehouse.getCars()) {
            System.out.println(car);
        }
    }
}
