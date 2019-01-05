package com.company.car_task;

public class Car {
    private double speed;
    private double fuel;
    private double fuelEconomy;

    public Car(double speed, double fuel, double fuelEconomy) {
        this.setSpeed(speed);
        this.setFuel(fuel);
        this.setFuelEconomy(fuelEconomy);
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getFuel() {
        return this.fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuelEconomy() {
        return this.fuelEconomy;
    }

    public void setFuelEconomy(double fuelEconomy) {
        this.fuelEconomy = fuelEconomy;
    }

    protected double calculateDistance( double speed, double time){
        double distance = speed * time;
        return distance;
    }

    protected double calculateTime(double distance, double speed){
        double time = distance / speed;
        return time;
    }

    protected double calculateFuel( double fuel, double fuelEconomy){
        double fuelLeft = fuel / fuelEconomy;
        return fuelLeft;
    }


}
