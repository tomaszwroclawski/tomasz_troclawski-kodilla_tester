package com.kodilla.inheritance.homework;

public class SystemsApplication {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1998);
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        Windows windows = new Windows("Windows 98",1998,2004);
        windows.turnOn();
        windows.turnOff();

        Android android = new Android("Android 2.0",2002,2004);
        android.turnOn();
        android.turnOff();
    }
}
