package com.radhika;

public class Main {

    public static void main(String[] args) {

        Printer print = new Printer(80,"Duplex",true,12);

        print.simulatePage();

        print.simulatePage();
    }
}
