package com.radhika;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int choice =0;
        displayOptions();

        boolean flag =true;
        while(flag){
            System.out.println("Select one to perform");

            choice = scan.nextInt();

            switch(choice){
                case 0:
                    displayOptions();
                    break;
                case 1:

                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
            }
    }


    public static void displayOptions() {

        System.out.println("\t Select one");
        System.out.println("\t 0 - Create New com.radhika.Contact");
        System.out.println("\t 1 - Modify com.radhika.Contact");
        System.out.println("\t 2 - Delete com.radhika.Contact");
        System.out.println("\t 3 - Search com.radhika.Contact");
        System.out.println("\t 4 - Display Contacts List");
        System.out.println("\t 5 - Quit");


    }

}