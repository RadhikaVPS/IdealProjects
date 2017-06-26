package com.radhika;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        int choice =0;
        boolean flag =false;
        printInstructions();

        while(!flag){
            System.out.print("Select your choice : ");
            choice = scan.nextInt();
            scan.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
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
                case 6:
                    flag = true;
                    break;
            }
        }

    }



    public static void printInstructions(){
        System.out.println("\t Press");
        System.out.println("\t 0 - To display choice option");
        System.out.println("\t 1 - To display list of grocery items");
        System.out.println("\t 2 - To add item to the grocery list");
        System.out.println("\t 3 - To modify item in the grocery list");
        System.out.println("\t 4 - To remove item in the grocery list");
        System.out.println("\t 5 - To search item in the grocery list");
        System.out.println("\t 6 - To quit the application");

    }

    public static void addItem(){

        System.out.print("Enter Item to add : ");
        groceryList.addGroceryItem(scan.nextLine());

    }

    public static void modifyItem(){

        System.out.print("Current Item name : ");
        String temp = scan.nextLine();
        System.out.print("Enter new Item : ");
        //scan.nextLine();
        String tempName = scan.nextLine();
        groceryList.modifyGroceryItem(temp,tempName);

        System.out.println("Item  " + temp + " is replaced with " + tempName);
    }

    public static void removeItem(){

        System.out.print("Enter the Item to be removed : ");

        String item = scan.nextLine();
        //scan.nextLine();
        groceryList.removeGroceryItem(item);
        System.out.println(item + " has been removed");


    }

    public static void searchItem(){

        System.out.print("Enter item to search :");
        String itemS = scan.nextLine();
        if(groceryList.onFile(itemS)){
            System.out.println( "Found "+ itemS + "  in your grocery list");
        } else {
            System.out.println(itemS + " is not found in the grocery list");
        }

    }


}
