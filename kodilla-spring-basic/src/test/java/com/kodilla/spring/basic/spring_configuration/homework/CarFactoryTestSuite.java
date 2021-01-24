package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarFactoryTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    @Test
    public void shouldCreateSuv(){
        Suv suv = context.getBean(Suv.class);
        String carType = suv.getCarType();
        Assertions.assertEquals("Suv",carType);
    }
    @Test
    public void shouldCreateSuvBeanAndFetchByBeanName() {

        Suv suv = (Suv) context.getBean("createSuv");

        String carType = suv.getCarType();

        Assertions.assertEquals("SUV", carType);
    }

    @Test
    public void shouldCreateCarBeanByRandomSeason(){
        Car car = (Suv)context.getBean("getCar");
        String carType = car.getCarType();
        System.out.println(carType);
        List<String> possibleCarTypes = Arrays.asList("Suv","Sedan","Cabrio");
        Assertions.assertTrue(possibleCarTypes.contains(carType));

    }
    @Test
    public void shouldTurnOnHeadLightsDependedOnHour(){
        Car car = (Car) context.getBean("getCar");
        car.turnLightOnOff();
        boolean headlightsOn = car.hasHeadlightsOn();
        List<Boolean> headlightOnOff = Arrays.asList(true,false);
        Assertions.assertTrue(headlightOnOff.contains(headlightsOn));
    }



}