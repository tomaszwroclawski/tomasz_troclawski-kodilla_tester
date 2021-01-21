package com.kodilla.spring.basic.dependency_injection.homework;

public class NotificationSuccessFull implements NotificationService {
    @Override
    public void success(String address) {
        System.out.println("Your Package delivered to : "+address);
    }

    @Override
    public void fail(String address) {
        System.out.println("! Your Package not delivered to: "+ address);
    }
}
