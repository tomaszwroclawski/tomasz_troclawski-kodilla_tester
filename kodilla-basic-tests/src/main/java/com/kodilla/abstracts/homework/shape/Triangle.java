package com.kodilla.abstracts.homework.shape;

public class Triangle extends Shape {
   private final double a;
   private final double h;
   private final double b;

   public Triangle (double a, double h,double b){
       this.a = a;
       this.h = h;
       this.b = b;

   }

    @Override
    public void calcCircuit() {
       openCircuit= a+b+b;
    }
@Override
    public void calcArea() {
        openArea=(a*h)/2;
    }

}

