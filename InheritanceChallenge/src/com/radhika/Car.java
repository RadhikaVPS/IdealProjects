package com.radhika;

/**
 * Created by radhi on 4/15/2017.
 */
public class Car extends Vehicle {

    //private int steering;
    private int seat;
    private String color;

    public Car(String type, String model, int seat, String color){
        super(4,type,model);
        //this.steering=steering;
        this.seat=seat;
        this.color=color;
    }

    public void changingGears(String gear){

        switch(gear){
            case "D4":
                System.out.println("Moving Forward with speed " + controlSpeed(60) + "m/h");
                controlSteering("left");
                break;
            case "Reverse":
                System.out.println("Moving Back");
                break;
            case "Neutral":
                System.out.println("Rest");
                break;
//            case "D3":
//                System.out.println("Moving Up");
        }



    }
    public int controlSpeed(int speed){

        if (speed>0 && speed <=30){
            System.out.println("Running at Gear 1");
        }else if(speed>30 && speed <=90){
            System.out.println("Running at Gear 2");
        }else if(speed>90 && speed <=150){
            System.out.println("Running at Gear 3");
        }

        return speed;
    }

    public void controlSteering(String direction){

        switch (direction){
            case "left":case "right":
                System.out.println("Now Turning " + direction);
                break;

            case "forward":case "reverse":
                System.out.println("Moving " + direction);
                break;
        }
    }


//    public int getSteering(){
//        return steering;
//    }

    public int getSeat(){
        return seat;
    }

    public String getcolor(){
        return color;
    }
}
