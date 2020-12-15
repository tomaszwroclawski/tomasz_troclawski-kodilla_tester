package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.homework.Audi;
import com.kodilla.collections.homework.Car;
import com.kodilla.collections.homework.Ford;
import com.kodilla.collections.homework.Opel;




public class CarUtils {

    private static Car ford;

    public static void describeCar(Car car) {

        System.out.println("---------------------------------------");
        System.out.println("Car kind:  " + getCarName(car));
        System.out.println("Car increase speed:  "+getCarIncreaseSpeed(car));


    }

    private static String getCarName(Car car) {

        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Audi)
            return "Audi";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Unknown car name";
    }
    public static int getCarIncreaseSpeed(Car car){
        int a= 5;
        int b= 2;
        int c =3 ;
        if (car instanceof  Ford)
            return a;
        else if (car instanceof Audi)
            return b;
        else  if(car instanceof Opel)
            return c;
        else
            return 11;
    }
}
