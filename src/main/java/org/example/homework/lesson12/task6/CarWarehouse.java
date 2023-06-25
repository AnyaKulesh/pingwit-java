package org.example.homework.lesson12.task6;

/*
Task 7
Есть склад авто и выяснилось, что всем присвоили неверные маркировки двигателя.
Необходимо все 1.4 литра двигатели заменить на 2.0Т, а все 1.8, на 1.8Т.

 */
public class CarWarehouse {
    private final Car[] cars;

    public CarWarehouse(Car[] cars) {
        this.cars = cars.clone();
    }

    public Car[] getCars() {
        return cars.clone();
    }

    public void updateEngineVolumes(String oldVolume, String newVolume) {
        for (Car car : cars) {
            if (car.getEngine().getVolume().equals(oldVolume)) {
                car.getEngine().setVolume(newVolume);
            }
        }
    }
}
