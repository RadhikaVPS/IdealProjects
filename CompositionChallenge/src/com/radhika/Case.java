package com.radhika;

/**
 * Created by radhi on 4/16/2017.
 */
public class Case {

    private String paint;
    private int doors;
    private Dimensions dimensions;

    public Case(String paint, int doors, Dimensions dimensions) {
        this.paint = paint;
        this.doors = doors;
        this.dimensions = dimensions;
    }

    public void openRoom(){
        System.out.println("Room is open");
    }

    public String getPaint() {
        return paint;
    }

    public int getDoors() {
        return doors;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
