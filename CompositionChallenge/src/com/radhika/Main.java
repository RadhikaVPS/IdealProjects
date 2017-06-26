package com.radhika;

public class Main {

    public static void main(String[] args) {


        Chair chair =new Chair("wheels",30,4,"Accent",20);

        Dimensions dimensions = new Dimensions(1550,1425);
        Case acase = new Case("White",2,dimensions);

        Temperature temperature = new Temperature(75,"Cool");
        AC ac= new AC("A5-10","Tata",temperature);

        Table table =new Table(4,"Accent","Regular");

        Room room = new Room(chair,table,acase,ac);

        room.doorSystem();
    }
}
