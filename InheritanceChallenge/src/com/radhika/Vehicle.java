package com.radhika;

/**
 * Created by radhi on 4/15/2017.
 */
public class Vehicle {

    private int wheels;
    private String type;
    private String model;

    public Vehicle(int wheels, String type, String model){
        this.wheels=wheels;
        this.type=type;
        this.model=model;
    }

    public int getWheels() {
        return wheels;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }
}
