package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Bentley;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.arrays.homework.CarUtils;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        carList.add(new Audi());
        carList.add(new BMW());
        carList.add(new Bentley());

        for (Car car : carList) {
            CarUtils.describeCar(car);
        }

        carList.remove(1);
        carList.remove(new BMW());

        System.out.println("Zawartość kolekcji: ");
        for (Car car : carList) {
            CarUtils.describeCar(car);
        }
        System.out.println("Rozmiar kolekcji: " + carList.size());
    }
}
