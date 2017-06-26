package com.radhika;

/**
 * Created by radhi on 4/16/2017.
 */
public class PC {

    private Case thecase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case thecase, Monitor monitor, MotherBoard motherBoard) {
        this.thecase = thecase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUp(){
        thecase.pressPowerButton();
        start();
    }
    public void start(){
        monitor.drawPixelAt(1500,2000, "purple");
    }
//
//    public Case getThecase() {
//        return thecase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
}
