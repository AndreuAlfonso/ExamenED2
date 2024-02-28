package com.exam2;

public class Lamp {
    private double consumption;
    private boolean turnedOn;

    Lamp(double consumption) {
        this.consumption = consumption;
    }

    Lamp(double consumption, boolean turnedOn) {
        this.consumption = consumption;
        this.turnedOn = turnedOn;
    }

    public boolean isOn() {
        return turnedOn;
    }

    public double getConsumption() {
        return consumption;
    }

    public void turnOn() {
        this.turnedOn = true;
    }

    public void turnOff() {
        this.turnedOn = false;
    }

    public void toggle() {
        if (turnedOn = true) {
            turnedOn = false;
        } else if (turnedOn = false) {
            turnedOn = true;
        }
    }

    public double consume(double seconds) {
        if (turnedOn = false) {
            return 0;
        } else if (turnedOn = true) {
            return getConsumption() * seconds / 3600;
        }
        return consumption;
    }
}