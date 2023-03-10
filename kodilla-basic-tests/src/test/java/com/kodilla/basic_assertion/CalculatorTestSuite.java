package com.kodilla.basic_assertion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSum() {
        double a = 55.1;
        double b = 8;
        double sumResult = calculator.sum(a, b);
        assertEquals(63.1, sumResult, 0.001);
    }

    @Test
    public void testSubtract() {
        double a = 15.332;
        double b = 8.1;
        double substractResult = calculator.subtract(a, b);
        assertEquals(7.232, substractResult, 0.001);
    }

    @Test
    public void testPower() {
        double a = -14.1;
        double b = 0;
        double c = 1.5;

        double powerResult = calculator.power(a);
        double powerResult1 = calculator.power(b);
        double powerResult2 = calculator.power(c);

        assertEquals(198.81, powerResult, 0.001);
        assertEquals(0, powerResult1, 0.001);
        assertEquals(2.25, powerResult2, 0.001);
    }
}