package com.kodilla.inheritance.homework;

public class OperatingSystem {
    int year;

    public OperatingSystem(int year) {
        this.year = year;
    }
    public void turnOn() {
        System.out.println("This system is turn on");
    }

    public void turnOff() {
        System.out.println("This system is turn off");
    }
}

