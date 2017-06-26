package com.radhika;

/**
 * Created by radhi on 4/16/2017.
 */
public class Temperature {

    private int degrees;
    private String mode;

    public Temperature(int degrees, String mode) {
        this.degrees = degrees;
        this.mode = mode;
    }

    public int getDegrees() {
        return degrees;
    }

    public String getMode() {
        return mode;
    }
}
