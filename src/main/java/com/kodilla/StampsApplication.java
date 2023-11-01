package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stampsCollection = new HashSet<>();

        Stamp stamp1 = new Stamp("Madrid", "2x3 cm", true);
        Stamp stamp2 = new Stamp("Sevilla", "3x4 cm", false);
        Stamp stamp3 = new Stamp("Grenada", "2x4 cm", true);

        stampsCollection.add(stamp1);
        stampsCollection.add(stamp2);
        stampsCollection.add(stamp3);

        for (Stamp stamp : stampsCollection) {
            System.out.println("Stamp Name: " + stamp.getName());
            System.out.println("Dimensions: " + stamp.getDimensions());
            System.out.println("Stamped: " + stamp.isStamped());
            System.out.println();
        }

        Stamp stamp4 = new Stamp("Sevilla", "3x4 cm", false);
        boolean added = stampsCollection.add(stamp4);
        System.out.println("Czy dodano ten sam znaczek po raz drugi? " + added);
        System.out.println("Rozmiar kolekcji po próbie dodania: " + stampsCollection.size());
    }
}
