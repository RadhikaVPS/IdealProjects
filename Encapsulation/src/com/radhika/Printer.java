package com.radhika;

/**
 * Created by radhi on 4/17/2017.
 */
public class Printer {

    private int tonerLevel;
    private int pages;
    private String type;
    private boolean printCommand;

    public Printer(int tonerLevel, String type, boolean printCommand, int pages){
        this.pages=pages;
        this.type=type;

        if (tonerLevel>0 && tonerLevel<=100){
            this.tonerLevel=tonerLevel;
        }
        this.printCommand=printCommand;
    }

    public void simulatePage(){

//        int i;
//        if(printCommand){
//            for(i=0;i<=pages;i++){
//                System.out.println("Printed pages : " + i);
//            }
//            i++;
//        }
//        tonerLevel--;
//        System.out.println("Toner Level : " + tonerLevel);
        int pagesPrinted = 0;
        int pagesToPrint=0;

        if(type == "Duplex") {
            pagesToPrint = pages / 2;
            System.out.println("Printing on both sides...");


            pagesPrinted += pages-;

            System.out.println("No. of pages Printed = " + pagesPrinted);
            //break;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPages() {
        return pages;
    }

    public String getType() {
        return type;
    }

    public boolean isPrintCommand() {
        return printCommand;
    }
}
