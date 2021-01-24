package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class ShippingCenterTestSuite {
    @Autowired
    ShippingCenter shippingCenter;

    @org.junit.jupiter.api.Test
    public void shouldReturnSuccessesMessage (){
        String s= "Package is delivered to: Anatievka";
        assertTrue(s.equals(shippingCenter.sendPackage("Anatievka",15)));
    }
    @Test
    public void shouldReturnFalseMessage(){
        String s="Package will be not delivered to: Anatievka";

    }


}