package com.kodilla.basic_assertion;

import com.kodilla.abstracts.basic_assertion.Calculator;
import com.kodilla.abstracts.basic_assertion.ResultChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double a = 5.6;
        double b = 5.8;
        double expectedSumResult = 11.4;
        double actualSumResult =calculator.sum(a, b);
        assertEquals(11.4,actualSumResult, 0.001);

        Calculator calculator1 = new Calculator();
        int c = 10;
        int d = 3;
        int substractionResult = calculator1.substract(c, d);
        boolean correctSubstraction = ResultChecker.assertEquals(7, substractionResult);

        int e = 7;
        double expectedSquareResultE = 49.0;
        double actualSquareResultE = calculator.square(e);
        assertEquals(expectedSquareResultE, actualSquareResultE, 0.01);

        int f = 0;
        double expectedSquareResultF = 0.0;
        double actualSquareResultF = calculator.square(f);
        assertEquals(expectedSquareResultF, actualSquareResultF, 0.01);

        int g = -2;
        double expectedSquareResultG = 4.0;
        double actualSquareResultG = calculator.square(g);
        assertEquals(expectedSquareResultG, actualSquareResultG, 0.01);
    }
    }

