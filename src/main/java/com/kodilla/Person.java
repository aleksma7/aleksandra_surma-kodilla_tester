package com.kodilla;

public class Person {
    private String name;
    private double age;
    private double height;

    public Person(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public boolean isOlderThan30() {
        return age > 30;
    }

    public boolean isTallerThan160() {
        return height > 160;
    }

    public void showPersonData() {
        System.out.println("Name:" + " " + name);
        System.out.println("Age:" + " " + age);
        System.out.println("Height:" + " " + height);
    }
}
