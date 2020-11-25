package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearSystem1;
    private int yearSystem2;
    public OperatingSystem (int yearSystem1,int yearSystem2){
        this.yearSystem1 = yearSystem1;
        this.yearSystem2=yearSystem2;
    }

    public void turnOn (){
        System.out.println("System was turn On");
    }
    public void turnOff(){
        System.out.println("System was turn Off");
    }
    public OperatingSystem (){
        System.out.println("OperatingSystem constructor");
    }
    public int getYearSystem1(){
        return yearSystem1;
    }
    public int getYearSystem2(){
        return yearSystem2;
    }
}
