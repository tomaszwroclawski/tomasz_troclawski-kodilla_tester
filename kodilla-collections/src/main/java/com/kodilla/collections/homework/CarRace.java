package com.kodilla.collections.homework;

public class CarRace {

    public static void doRace(Car car) {
      /*  car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();*/


        System.out.println(car.getName() + "  osiąga prędkość do: " + car.getSpeed() + "  km/h");
        System.out.println(car.getName() + "  prędkość na zwolnionym hamulcu:  " + car.getSpeed()+ "km/h");

    }


    public static void main(String[] args) {
        System.out.println("Przygotować się... 3... 2.... 1...  Gooooo!");
        System.out.println(" i poszli jak przecinaki po betonie :) ");

        Audi audi = new Audi();
        audi.name = "Audi";
        showCarSpeed(audi);
        doRace(audi);


        Ford ford = new Ford();
        ford.name = "Ford";
        showCarSpeed(ford);
        doRace(ford);


        Opel opel = new Opel();
        opel.name = "Opel";
        showCarSpeed(opel);
        doRace(opel);

    }

    private static void showCarSpeed(Car car) {
        System.out.println("Prędkość początkowa dla  " + car.getName() + " = " + car.getSpeed());
    }


}
