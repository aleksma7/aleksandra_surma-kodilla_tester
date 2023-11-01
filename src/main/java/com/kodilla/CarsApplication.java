package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Bentley;
import com.kodilla.collections.interfaces.homework.Car;

import java.util.Random;

public class CarsApplication {
    public static Car drawCar() {
        Random random = new Random();
        int randomSpeed = random.nextInt(101);
        int randomBrand = random.nextInt(3);

        Car car;

        if (randomBrand == 0) {
            car = new Bentley();
        } else if (randomBrand == 1) {
            car = new BMW();
        } else {
            car = new Audi();
        }

        for (int i = 0; i < randomSpeed; i++) {
            car.increaseSpeed();
        }

        return car;
    }

    public static void main(String[] args) {
        int numberOfCars = new Random().nextInt(15) + 1;
        Car[] cars = new Car[numberOfCars];

        for (int i = 0; i < numberOfCars; i++) {
            cars[i] = drawCar();
        }

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}