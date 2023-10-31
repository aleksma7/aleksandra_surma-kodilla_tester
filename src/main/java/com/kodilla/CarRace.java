package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car Bentayga = new Bentley();
        Car M550i = new BMW();
        Car RS7 = new Audi();

        doRace(Bentayga);
        doRace(M550i);
        doRace(RS7);
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
