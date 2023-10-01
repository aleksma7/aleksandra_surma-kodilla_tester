package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 7, 3, 4, 12);

        double area = triangle.calculateArea();
        System.out.println("Pole trójkąta wynosi " + area);

        double Circumference = triangle.calculateCircumference();
        System.out.println("Obwód trójkąta wynosi " + Circumference);
        System.out.println(" ");

        Square square = new Square(7);

        double squareArea = square.calculateArea();
        System.out.println("Pole kwadratu wynosi " + squareArea);

        double squareCircumference = square.calculateCircumference(); // Poprawka na calculatePerimeter()
        System.out.println("Obwód kwadratu wynosi " + squareCircumference);
        System.out.println(" ");

        Trapeze trapeze = new Trapeze(4,4,10,7,5);

        double trapezeArea = trapeze.calculateArea();
        System.out.println("Pole trapezu wynosi" + " " + trapezeArea);

        double trapezeCircumference = trapeze.calculateCircumference();
        System.out.println("Obwód trapezu wynosi" + " " + trapezeCircumference);
    }
}
