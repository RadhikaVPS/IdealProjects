package com.radhika;

public class Main {

    public static void main(String[] args) {
//        int display = calculateScore("Radhi", 50);
//        System.out.println("New Score is " + display);
//
//        calculateScore(1000);
//        calculateScore(500);
//        calculateScore();

        double centimeter = calcFeetAndInchesToCentimeters(6,0);
        if(centimeter<0.0){
            System.out.println("Error");
        }
        calcFeetAndInchesToCentimeters(157);
    }

//    public static int calculateScore(String playerName, int score) {
//        System.out.println("Player :" + playerName + "; Score :" + score);
//        return score * 1000;
//    }
//    public static int calculateScore( int score) {
//        System.out.println("No Player Name Score :" + score);
//        return score * 1000;
//    }
//    public static int calculateScore() {
//        System.out.println("No data");
//        return 0;
//    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet <0) || (inches <0 ||inches >12)) {
            System.out.println("Invalid Input");
            return -1;
        }
        double centimeters =(feet*12) *2.54;
        centimeters += inches *2.54;
        System.out.println(feet + " feet, " + inches + " inches equals " + centimeters + "centimeters");
        return centimeters;
   }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches<0) {
            return -1;
        }

            double feet = (int) inches/12;
            double remaining = (int) inches %12;

            return calcFeetAndInchesToCentimeters(feet, remaining);



    }

}
