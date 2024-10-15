package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarDatabase {
    private List<Car> cars;

    public CarDatabase() {
        cars = Arrays.asList(
            new Car("1", "Golf III", "Volkswagen"),
            new Car("2", "Multipla", "Fiat"),
            new Car("3", "Megane", "Renault")
        );
    }

    public List<Car> getCars() {
        return cars;
    }
}