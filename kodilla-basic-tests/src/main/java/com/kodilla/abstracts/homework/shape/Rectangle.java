package com.kodilla.abstracts.homework.shape;

public class Rectangle extends Shape {
    private final double a;
    private final double b;

    public Rectangle (double a, double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public void calcCircuit() {
        openCircuit= (a+b)*2;
    }
    @Override
    public void calcArea() { openArea=(a+b);}
}

