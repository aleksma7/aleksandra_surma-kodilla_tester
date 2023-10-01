package com.kodilla.abstracts.basic_assertion;

public class ApplicationCalc2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correctSum = ResultChecker.assertEquals(13, sumResult);

        if (correctSum) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        Calculator calculator1 = new Calculator();
        int c = 10;
        int d = 3;
        int substractionResult = calculator1.substract(c, d);
        boolean correctSubstraction = ResultChecker.assertEquals(7, substractionResult);

        if (correctSubstraction) {
            System.out.println("Metoda subsrtact działa poprawnie dla liczb" + c + " i " + d);
        } else {
            System.out.println("Metoda subsrtact nie działa poprawnie dla liczb" + " " + c + " i " + d);
        }
        int e = 7;
        int squareResult = calculator.square(e);
        boolean correctSquareResult = ResultChecker.assertEquals(49, squareResult);

        if (correctSquareResult) {
            System.out.println("Metoda square działa poprawnie dla liczby" + " " + 7);
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczby" + " " + 7);
        }
        }
    }

