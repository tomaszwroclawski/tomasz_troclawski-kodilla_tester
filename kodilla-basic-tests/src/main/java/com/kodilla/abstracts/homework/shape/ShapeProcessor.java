package com.kodilla.abstracts.homework.shape;


public class ShapeProcessor {
    public void process(Shape shape) {

        shape.calcArea();
        System.out.println("Pole powierzchni:  " + shape.getOpenArea() + "[cm2]");

        shape.calcCircuit();
        System.out.println("Obwód : " + shape.getOpenCircuit() + "[cm]");
    }
}
