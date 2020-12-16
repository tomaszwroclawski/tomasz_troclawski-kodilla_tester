package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.homework.Audi;
import com.kodilla.collections.homework.Car;
import com.kodilla.collections.homework.Ford;
import com.kodilla.collections.homework.Opel;




public class CarUtils {

    public static void describeCar(Car car) {

        System.out.println("---------------------------------------");
        System.out.println("Car kind:  " + getCarName(car));
        System.out.println("Car increase speed:  "+getCarIncreaseSpeed(car));


    }

    private static String getCarName(Car car) {

            return car.getName();
    }
    public static int getCarIncreaseSpeed(Car car){
         return car.getSpeed();

    }
}
