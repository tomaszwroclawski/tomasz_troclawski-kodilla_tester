package com.kodilla.spring.basic.dependency_injection.homework;

public class DeliveryInProgress implements DeliveryService {
    @Override
    public boolean deliveryPackage(String address, double weight) {
        if ( weight >30){
            System.out.println("Your Package is to heavy ! max 30 kg");
            return  false;
        }
        System.out.println("Delivery is in progress...");
        return true;
    }
}
