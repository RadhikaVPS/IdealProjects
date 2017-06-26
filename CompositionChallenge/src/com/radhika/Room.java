package com.radhika;

/**
 * Created by radhi on 4/16/2017.
 */
public class Room {
    private Chair theChair;
    private Table theTable;
    private Case aCase;
    private AC ac;

    public Room(Chair theChair, Table theTable, Case aCase, AC ac) {
        this.theChair = theChair;
        this.theTable = theTable;
        this.aCase = aCase;
        this.ac = ac;
    }

    public void doorSystem(){
        aCase.openRoom();
        availableSpace();
    }

    public void availableSpace(){
        theChair.emptyChair();
    }


    public Table getTheTable() {
        return theTable;
    }



    public AC getAc() {
        return ac;
    }
}
