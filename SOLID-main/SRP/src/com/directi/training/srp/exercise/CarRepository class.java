package com.directi.training.srp.exercise;

public class CarRepository {
    private CarDatabase carDatabase;

    public CarRepository(CarDatabase carDatabase) {
        this.carDatabase = carDatabase;
    }

    public Car getCarById(String carId) {
        for (Car car : carDatabase.getCars()) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }
}