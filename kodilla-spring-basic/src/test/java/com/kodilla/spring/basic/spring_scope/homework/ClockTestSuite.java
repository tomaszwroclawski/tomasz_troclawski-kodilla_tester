package com.kodilla.spring.basic.spring_scope.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ClockTestSuite {

    public void time (int i){
        try {
            Thread.sleep(i);
        }
        catch (InterruptedException ie){
            Thread.currentThread().interrupt();
        }
    }
@Test
    public void shouldCreateDifferentClock() {
    ApplicationContext  context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Clock firstClock = context.getBean(Clock.class);
    LocalTime firstTime = firstClock.processClock();
    time(1);
    Clock secondClock = context.getBean(Clock.class);
    LocalTime secondTime = secondClock.processClock();
    time(2);
    Clock thirdClock = context.getBean(Clock.class);
    LocalTime thirdTime = thirdClock.processClock();
    time(3);
    Assertions.assertNotEquals(firstTime,secondTime);
    Assertions.assertNotEquals(secondTime,thirdTime);
    Assertions.assertNotEquals(firstTime,thirdTime);

}
}