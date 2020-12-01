package com.kodilla.inheritance.homework;

public class Windows {
    private String system;
    int year1;
    int year2;

    public Windows(String system,int year1, int year2) {
        this.system = system;
        this.year1 = year1;
        this.year2=year2;
    }

    public void turnOn() {
        System.out.println(system +" " + year1 + " "+" was turn on");
    }
    public void turnOff() {
        System.out.println(system +" "+year2 + " was turn off");
    }
}

