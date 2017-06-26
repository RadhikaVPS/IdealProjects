package com.radhika;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);


        Resolution resolution = new Resolution(12,16);
        Monitor theMonitor =new Monitor("27inch Beast", "Acer",27, resolution);

        MotherBoard theMotherBoard = new MotherBoard("BJ-200","Asus",4,6,"v2.44");

        PC thePC = new PC(theCase,theMonitor,theMotherBoard);
//        thePC.getMonitor().drawPixelAt(1500,1200,"red");
//        thePC.getMotherBoard().loadProgram("Windows 1.0");

        thePC.powerUp();


    }
}
