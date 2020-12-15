package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.homework.Audi;
import com.kodilla.collections.homework.Car;
import com.kodilla.collections.homework.Ford;
import com.kodilla.collections.homework.Opel;


import java.util.Random;

import static com.kodilla.collections.arrays.homework.CarUtils.describeCar;

public class CarsApplication {


    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15)];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car: cars)
            describeCar(car);

    }


    public static Car drawCar() {
        Random random = new Random();
        int drawnCar = random.nextInt(3);
        var increaseSpeed = random.nextInt(158);

        if (drawnCar == 0)
            return new Ford();
        else if (drawnCar == 1)
            return new Audi();
        else
            return new Opel();

    }
}







