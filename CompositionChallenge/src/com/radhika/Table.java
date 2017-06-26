package com.radhika;

/**
 * Created by radhi on 4/16/2017.
 */
public class Table {
    private int seat;
    private String manufacturer;
    private String type;

    public Table(int seat, String manufacturer, String type) {
        this.seat = seat;
        this.manufacturer = manufacturer;
        this.type = type;
    }



    public int getSeat() {
        return seat;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getType() {
        return type;
    }
}
