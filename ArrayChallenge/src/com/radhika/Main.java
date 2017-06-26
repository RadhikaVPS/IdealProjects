package com.radhika;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = getArray(5);

       int[] trail = sortArray(array);
       printArray(trail);
    }

    public static int[] getArray(int number) {

        System.out.println("Enter " + number + " values");

        int[] value = new int[number];


        for (int i = 0; i < value.length; i++) {
            value[i] = scan.nextInt();
        }
        return value;
    }

    public static void printArray(int[] a) {

        for (int i = 0; i < a.length; i++) {

            System.out.println("Value at position " + i + " is : " + a[i]);
        }
    }

    public static int[] sortArray(int[] sort) {
        //int[] toSort = sort;

        for (int i = 0; i < sort.length; i++) {

            for (int j = i; j < sort.length; j++) {

                if (sort[i] < sort[j]) {

                    int temp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = temp;

                }
            }
        }
        return sort;
    }

}

