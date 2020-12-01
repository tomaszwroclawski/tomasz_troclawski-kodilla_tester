package com.kodilla.abstracts.homework.shape;

public class Trapeze extends Shape {
    private final double a;
    private final double b;
    private final double c;
    private final double h;
    private final double d;


    public Trapeze (double a, double b, double c, double h,double d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        this.d = d;


    }
    @Override
    public void calcCircuit() {
        openCircuit= (a+b+c+d);
    }
    @Override
    public void calcArea() { openArea=(a+b)*h/2;}
}
