package com.radhika;

/**
 * Created by radhi on 4/16/2017.
 */
public class Chair {

    private String type;
    private int totalChair;
    private int legs;
    private int chairOccupied;
    private String manufacturer;

    public Chair(String type, int totalChair, int legs,String manufacturer, int chairOccupied){
        this.type=type;
        this.totalChair=totalChair;
        this.legs=legs;
        this.manufacturer=manufacturer;
        this.chairOccupied=chairOccupied;
    }


    public void emptyChair(){
        if (totalChair>chairOccupied){
            totalChair = totalChair-chairOccupied;
            System.out.println("Available space = " + totalChair);
        }
    }

    public String getType() {
        return type;
    }

    public int getTotalChair() {
        return totalChair;
    }

    public int getLegs() {
        return legs;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
