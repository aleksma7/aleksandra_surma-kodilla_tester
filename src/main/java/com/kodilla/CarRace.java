package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car bentayga = new Bentley();
        Car m550i = new BMW();
        Car rS7 = new Audi();

        doRace(bentayga);
        doRace(m550i);
        doRace(rS7);
    }

    public static void doRace(Car car) {
        for (int i = 0; i < 3; i++) {
            car.increaseSpeed();
        }

        for (int i = 0; i < 2; i++) {
            car.decreaseSpeed();
        }

        System.out.println("Prędkość po wyścigu: " + car.getSpeed());
    }
}
