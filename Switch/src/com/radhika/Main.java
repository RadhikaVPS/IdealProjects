package com.radhika;

public class Main {

    public static void main(String[] args) {

//        char character = 'D';
//
//        switch (character) {
//
//            case 'A':case'B':case'C':case'D':case'E':
//                System.out.println("Found letter " + character);
//                break;
//            case 'B':
//                System.out.println("Found letter " + character);
//                break;
//            case 'C':
//                System.out.println("Found letter " + character);
//                break;
//            case 'D' :
//                System.out.println("Found letter " + character);
//                break;
//            case 'E':
//                System.out.println("Found letter " + character);
//                break;
//            default:
//                System.out.println("Found letter other than A, B, C, D or E");
//                break;
//        }

        String name= "RADHIKA";

        switch(name.toLowerCase()){
            case "radhika":case"rohit":case"abhishek":
                System.out.println("Hi, my name is " + name);
                break;

                default:
                    System.out.println("Unknown person");
                    break;
        }

    }
}
