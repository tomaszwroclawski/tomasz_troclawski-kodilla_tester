package com.kodilla.abstracts.homework.shape;

public abstract class Shape {
    protected double openArea;
    protected double openCircuit;


    public double getOpenArea() {
        return openArea;
    }

    public double getOpenCircuit() {
        return openCircuit;
    }

    public abstract void calcArea();

    public abstract void calcCircuit();

}
