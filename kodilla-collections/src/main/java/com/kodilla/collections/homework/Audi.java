package com.kodilla.collections.homework;

import java.util.Objects;

public class Audi implements Car {
    public String name = "Audi";
    private int speed;
    private final int enginePower;
    private final int breaksPower;
    private final int maxSpeed;

    public Audi() {
        this.speed = 100;
        this.enginePower = 150;
        this.breaksPower = 1;
        this.maxSpeed = 240;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed(int speed) {
        this.speed += speed;
        if (this.speed > maxSpeed) {
            this.speed = maxSpeed;
        }
    }


    @Override
    public void decreaseSpeed(int speed) {
        this.speed -= speed;
        if (this.speed < 0) {
            this.speed = 0;
        }
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Audi audi = (Audi) o;
        return speed == audi.speed &&
                enginePower == audi.enginePower &&
                breaksPower == audi.breaksPower &&
                maxSpeed == audi.maxSpeed &&
                Objects.equals(name, audi.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed, enginePower, breaksPower, maxSpeed);
    }
}



