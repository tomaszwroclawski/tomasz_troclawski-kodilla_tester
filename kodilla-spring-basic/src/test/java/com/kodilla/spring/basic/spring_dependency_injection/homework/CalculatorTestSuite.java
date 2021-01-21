package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
    Calculator bean = context.getBean(Calculator.class);.

    @Test
    public void shouldReturnResultOfSummation(){
        Double summation = bean.addition(2.80,8.99);
        Assertions.assertEquals(11.79, summation,0.01 );
    }
    @Test
    public void shouldReturnResultOfSubtraction() {
        Double subtraction = bean.subtract(2.80, 8.99);
        Assertions.assertEquals(-6.19, subtraction, 0.01);
    }
    @Test
    public void shouldReturnResultOfMultiplication(){
        Double multiplication = bean.multiply(2.80,8.99);
        Assertions.assertEquals(25.172,multiplication,0.001);
    }
    @Test
    public void shouldReturnResultOfDivided() throws ZeroExceptionUsage{
        Double divided = bean.divide(18.00,4.00);
        Assertions.assertEquals(2.50,divided,0.01);
    }
    @Test
    public void shouldReturnResultExceptionWhenDividedByZero(){
        Assertions.assertThrows(ZeroExceptionUsage.class, () ->{
            Double divided = bean.divide( 18.00,0);
        });
    }


}