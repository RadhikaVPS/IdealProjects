package com.radhika;

/**
 * Created by radhi on 4/16/2017.
 */
public class AC {
    private String model;
    private String manufacturer;
    private Temperature temp;


    public AC(String model, String manufacturer, Temperature temp) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.temp = temp;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Temperature getTemp() {
        return temp;
    }
}
