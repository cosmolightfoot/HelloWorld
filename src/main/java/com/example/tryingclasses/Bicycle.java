package com.example.tryingclasses;

public class Bicycle {
    private int gear;
    private int speed;

    public Bicycle(int startGear, int startSpeed) {
        gear = startGear;
        speed = startSpeed;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public int rideFaster(int increment) {
        speed += increment;
    }

    public int applyBrakes(int decrement) {
        speed -= decrement;
    }

    public void changeGear(int newGear) {
        if (newGear <= 0) {
            throw new Exception();
        } else {
            gear = newGear;
        }

    }


}
