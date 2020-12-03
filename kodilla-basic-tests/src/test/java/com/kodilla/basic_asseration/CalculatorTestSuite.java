package com.kodilla.basic_asseration;

import com.kodilla.basic_assertion.Calculator;
import com.kodilla.basic_assertion.ResultChecker;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
@Test
    public void testSubstract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int substractResult = calculator.subtract(a, b);
        assertEquals(-3, substractResult);
    }
    @Test
    public void testPower(){
        Calculator calculator = new Calculator();
        double c=5;
        double n=2;

        double powerResult = calculator.power(c,n);
       assertEquals(25, powerResult);

    }
}
