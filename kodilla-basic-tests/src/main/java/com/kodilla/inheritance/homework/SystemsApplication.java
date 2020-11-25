package com.kodilla.inheritance.homework;

public class SystemsApplication {
    public static void main(String[]args){

        OperatingSystem operatingSystem = new OperatingSystem(2015,2020);
        operatingSystem.turnOn();

        NewOperatingSystem newOperatingSystem = new NewOperatingSystem(2015,2018);
        newOperatingSystem.turnOn();
        System.out.println(newOperatingSystem.getYearSystem2());
        newOperatingSystem.closedOldSys();


    }
}
