package com.kodilla.inheritance.homework;

public class NewOperatingSystem extends OperatingSystem {
    public void openOldSys(){
        System.out.println("Old system was open");
    }
    public void closedOldSys(){
        System.out.println("Old system is closed");
    }
    @Override
    public void turnOn() {
        System.out.println("System was turn On and  press 2");
    }
    public NewOperatingSystem(int yearSystem1,int yearSystem2){
        super(yearSystem1,yearSystem2);
        System.out.println("NewOperatingSystem constructor");
    }
}
