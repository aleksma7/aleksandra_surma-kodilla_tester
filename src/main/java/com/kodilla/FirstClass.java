package com.kodilla;

public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2023);
        System.out.println("Notebook:");
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.yearOfProduction);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkQuality();
        System.out.println(" " +
                "");
        Notebook heavyNotebook = new Notebook(2000, 1500, 2019);
        System.out.println("heavyNotebook:");
        System.out.println(heavyNotebook.price + " " + heavyNotebook.weight + " " + heavyNotebook.yearOfProduction);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkQuality();
System.out.println(" " +
        "");
        Notebook oldNotebook = new Notebook(1200, 300, 2015);
        System.out.println("oldNotebook:");
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.yearOfProduction);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkQuality();
        System.out.println(" " +
                "");
        Notebook greenNotebook = new Notebook(700, 1200, 2022);
        System.out.println("greenNotebook:");
        System.out.println(greenNotebook.weight + " " + greenNotebook.price + " " + greenNotebook.yearOfProduction);
        greenNotebook.checkPrice();
        greenNotebook.checkWeight();
        greenNotebook.checkQuality();
        System.out.println(" " +
                "");
        Notebook goldenNotebook = new Notebook (500, 1700, 2012);
        System.out.println("goldenNotebook:");
        System.out.println(goldenNotebook.weight + " " + goldenNotebook.price + " " + goldenNotebook.yearOfProduction);
        goldenNotebook.checkPrice();
        goldenNotebook.checkWeight();
        goldenNotebook.checkQuality();
        System.out.println(" " +
                "");
        Notebook vintageNotebook = new Notebook (1200, 1600,2007);
        System.out.println("vintageNotebook: ");
        System.out.println(vintageNotebook.weight + " " + vintageNotebook.price + " " + vintageNotebook.yearOfProduction);
        vintageNotebook.checkPrice();
        vintageNotebook.checkWeight();
        vintageNotebook.checkQuality();
    }
}