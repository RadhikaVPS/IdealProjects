package com.radhika;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        int[] myVariable = getValue(5);
        for(int i=0;i<myVariable.length;i++) {
            System.out.println("Entered " + i + " value is :" + myVariable[i]);

        }
        System.out.println("Average " + sumArray(myVariable));
    }


        public static int[] getValue(int number){
            System.out.println("Enter " + number + " values" + "\r");

            int [] value = new int[number];

            for (int j=0;j<value.length;j++) {
                value[j] = scan.nextInt();
            }
            return value;

        }


        public static double sumArray(int[] array){
            int sum=0;
            for (int j=0; j<array.length; j++){

                sum += array[j];
            }

            return (double) sum/ (double) array.length;


        }


}
