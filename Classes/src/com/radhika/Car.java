package com.radhika;

/**
 * Created by radhi on 4/13/2017.
 */
public class Car {

    public int wheels;
    private String color;
    private String model;
    private int doors;
    private String engine;

    public void setModel(String model) {
        String testModel = model.toLowerCase();
        if ((testModel == "audi9")||(testModel == "audi2")) {
            this.model = model;
        }else{
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return model;
    }
}
