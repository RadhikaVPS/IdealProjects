package com.radhika;

public class Main {

    public static void main(String[] args) {

        System.out.println("\t\t  WELCOME TO BILLS BURGER  \t\t\n \\");


        BaseHamburger base = new BaseHamburger("Multi Grain", "Chicken", 5, "Onions", "Carrot", "Tomato", "Lettuce");
        HealthyBurger healthy = new HealthyBurger("Beef", 6.0, "Lettuce", "Onions", "Tomato", "Capsicum", "Jalpeneos", "Extra cheese");
        DuluxeBurger dulex = new DuluxeBurger("Multi Grain", "Fish", 6.5, "Tomato", "Capsicum", "Lettuce", "Null");

        base.basePrice();

        System.out.println("\n ################################## \n");

        healthy.basePrice();

        System.out.println("\n ################################## \n");

        dulex.basePrice();

    }


}
