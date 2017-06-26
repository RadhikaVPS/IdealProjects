package com.radhika;

/**
 * Created by radhi on 4/19/2017.
 */
public class BaseHamburger {


    private String breadRollType;
    private String meat;
    private int additions;
    private double basePrice;
    private double totalPrice;
    private double additionsPrice;
    private String add1;
    private String add2;
    private String add3;
    private String add4;


    public BaseHamburger(String breadRollType, String meat, double basePrice, String add1, String add2, String add3, String add4) {

        this.breadRollType = breadRollType;
        this.meat = meat;
        this.additions = 4;
        this.basePrice = basePrice;
        this.totalPrice = 0;
        this.add1 = add1;
        this.add2 = add2;
        this.add3 = add3;
        this.add4 = add4;

    }


    public double basePrice() {

        System.out.println("\t\t Order for " + getClass().getSimpleName() + "\t\t\n");
        System.out.println("Base Price " + getClass().getSimpleName() + " \t\t $" + basePrice);

        additionsPrice += additions(add1);
        additionsPrice += additions(add2);
        additionsPrice += additions(add3);
        additionsPrice += additions(add4);
        additionsPrice += selectMeat();

        //    totalPrice = basePrice + additionsPrice;
//        System.out.println();
//        System.out.println("The total price to be paid is : $" + (double priceAdd = super.basePrice(); + additionsPrice));

        return additionsPrice;
    }

    public double selectMeat() {

        double meatPrice = 0;

        switch (meat) {
            case "Chicken":
                meatPrice = 2.0;
                System.out.println("Chicken was Selected");
                System.out.println("Price :" + " \t\t\t\t\t\t $" + meatPrice);
                break;
            case "Beef":
                meatPrice = 3.0;
                System.out.println("Beef was Selected");
                System.out.println("Price :" + " \t\t\t\t\t\t $" + meatPrice);
                break;
            case "Fish":
                meatPrice = 2.5;
                System.out.println("Fish was Selected");
                System.out.println("Price :" + " \t\t\t\t\t\t $" + meatPrice);
                break;
        }
        return meatPrice;

    }


    public double additions(String a) {


        switch (a) {
            case "Lettuce":
                additionsPrice = 1.5;
                System.out.println("Lettuce was Selected");
                System.out.println("Price :" + " \t\t\t\t\t\t $" + additionsPrice);
                break;

            case "Onions":
                additionsPrice = 2.0;
                System.out.println("Onions was Selected");
                System.out.println("Price :" + " \t\t\t\t\t\t $" + additionsPrice);
                break;

            case "Tomato":
                additionsPrice = 0.5;
                System.out.println("Tomato was Selected");
                System.out.println("Price :" + " \t\t\t\t\t\t $" + additionsPrice);
                break;

            case "Carrot":
                additionsPrice = 1.5;
                System.out.println("Carrot was Selected");
                System.out.println("Price :" + " \t\t\t\t\t\t $" + additionsPrice);
                break;

            case "Capsicum":
                additionsPrice = 2.0;
                System.out.println("Capsicum was Selected");
                System.out.println("Price :" + " \t\t\t\t\t\t $" + additionsPrice);
                break;

            case "Extra cheese":
                additionsPrice = 2.5;
                System.out.println("Extra cheese was Selected ");
                System.out.println("Price :" + " \t\t\t\t\t\t $" + additionsPrice);
                break;

            case "Jalpeneos":
                additionsPrice = 1.0;
                System.out.println("Jalpeneos was Selected");
                System.out.println("Price :" + " \t\t\t\t\t\t $" + additionsPrice);
                break;

            case "Null":
                additionsPrice = 0.0;
                System.out.println("No item was Selected");
                System.out.println("Price :" + " \t\t\t\t\t\t $" + additionsPrice);
                break;
        }

        return additionsPrice;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
