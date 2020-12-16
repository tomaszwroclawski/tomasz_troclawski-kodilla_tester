package com.kodilla.collections.homework;

import java.util.Objects;

public class Ford implements Car {
    public String name = "Ford";
    private int speed;
    private final int enginePower;
    private final int breaksPower;
    private final int maxSpeed;

    public Ford() {
        this.speed = 80;
        this.enginePower = 105;
        this.breaksPower = 4;
        this.maxSpeed = 180;
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
        Ford ford = (Ford) o;
        return speed == ford.speed &&
                enginePower == ford.enginePower &&
                breaksPower == ford.breaksPower &&
                maxSpeed == ford.maxSpeed &&
                Objects.equals(name, ford.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed, enginePower, breaksPower, maxSpeed);
    }
}
