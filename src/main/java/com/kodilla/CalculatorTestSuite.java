package com.kodilla.basic_assertion;

import com.kodilla.abstracts.basic_assertion.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);

        int e = 7;
        double squareResultE = calculator.square(e);
        assertEquals(49.0, squareResultE, 0.01);

        int f = 0;
        double squareResultF = calculator.square(f);
        assertEquals(0.0, squareResultF, 0.01);

        int g = -4;
        double squareResultG = calculator.square(g);
        assertEquals(16.0, squareResultG, 0.01);
    }
    }

