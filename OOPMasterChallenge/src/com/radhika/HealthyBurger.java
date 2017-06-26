package com.radhika;

/**
 * Created by radhi on 4/19/2017.
 */
public class HealthyBurger extends BaseHamburger {


    private double extraAdditionsPrice;
//    private String add1;
//    private String add2;
//    private String add3;
//    private String add4;
    private String add5;
    private String add6;
    private double totalPriceH;
    private double basePrice;

    public HealthyBurger (String meat, double basePrice, String add1, String add2, String add3, String add4, String add5, String add6){
        super ("Brown rye",meat,basePrice,add1,add2,add3,add4);

//        this.add1=add1;
//        this.add2=add2;
//        this.add3=add3;
//        this.add4=add4;
        this.add5 = add5;
        this.add6 = add6;
        this.totalPriceH=0;
        this.basePrice=basePrice;

    }

    @Override
    public double basePrice() {
        double priceAdd = super.basePrice();

//        System.out.println("\t\t Order for " + getClass().getSimpleName() + "\t\t\n");
//        System.out.println("Base Price of " + getClass().getSimpleName() + " \t $" + basePrice);

//        extraAdditionsPrice += additions(add1);
//        extraAdditionsPrice += additions(add2);
//        extraAdditionsPrice += additions(add3);
//        extraAdditionsPrice += additions(add4);
        extraAdditionsPrice += additions(add5);
        extraAdditionsPrice += additions(add6);
//        extraAdditionsPrice += selectMeat();

        System.out.println();
        System.out.println("The total price to be paid is : $" + (basePrice + extraAdditionsPrice + priceAdd));
//


        return extraAdditionsPrice;

    }
}
