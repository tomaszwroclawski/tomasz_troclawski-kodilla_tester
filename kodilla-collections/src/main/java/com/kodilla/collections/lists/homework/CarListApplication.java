package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.homework.Audi;
import com.kodilla.collections.homework.Car;
import com.kodilla.collections.homework.Ford;
import com.kodilla.collections.homework.Opel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CarListApplication {

    private static Object Ford;

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Ford ford = new Ford();
        cars.add(new Ford());
        cars.add(new Opel());
        cars.add(ford);
        cars.add(new Audi());

        cars.remove(1);
        cars.remove(ford);



        System.out.println(cars.size());
        for (Car car: cars){
            CarUtils.describeCar(car);
        }

    }

}