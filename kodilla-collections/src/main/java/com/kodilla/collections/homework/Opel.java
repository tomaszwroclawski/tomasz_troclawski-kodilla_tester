package com.kodilla.collections.homework;

import java.util.Objects;

public class Opel implements Car{
    public String name = "Opel";
    private int speed;
    private final int enginePower;
    private final int breaksPower;
    private final int maxSpeed;

    public Opel() {
        this.speed = 90;
        this.enginePower = 105;
        this.breaksPower = 4;
        this.maxSpeed = 195;
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
        Opel opel = (Opel) o;
        return speed == opel.speed &&
                enginePower == opel.enginePower &&
                breaksPower == opel.breaksPower &&
                maxSpeed == opel.maxSpeed &&
                Objects.equals(name, opel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed, enginePower, breaksPower, maxSpeed);
    }
}
