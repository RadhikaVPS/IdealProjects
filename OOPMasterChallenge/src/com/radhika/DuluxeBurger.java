package com.radhika;

/**
 * Created by radhi on 4/19/2017.
 */
public class DuluxeBurger extends BaseHamburger{

    private boolean chips =true;
    private boolean drinks=true;
    private double additionsPrice;
//    private String add1;
//    private String add2;
//    private String add3;
//    private String add4;
    private double basePrice;




    public DuluxeBurger(String breadRollType, String meat, double basePrice,String add1, String add2, String add3, String add4){
        super(breadRollType,meat,basePrice,add1,add2,add3,add4);

//        this.add1=add1;
//        this.add2=add2;
//        this.add3=add3;
//        this.add4=add4;
        this.basePrice=basePrice;
    }

    public double extraItem(){

        double extraItemPrice =0.0;
        if((chips)){
            extraItemPrice += 2.75;
            System.out.println("Chips was Added" + "\n Price : \t\t\t\t\t\t $" + extraItemPrice );
        }
        if((drinks)){
            extraItemPrice +=1.81;
            System.out.println("Drinks was Added" + "\n Price : \t\t\t\t\t\t $" + extraItemPrice );
        }
        return extraItemPrice;
    }


    @Override
    public double basePrice() {

        double priceAdd = super.basePrice();

//        System.out.println("\t\t Order for " + getClass().getSimpleName() +"\t\t\n");
//        System.out.println("Base Price of " + getClass().getSimpleName()+ " \t\t $" + basePrice);

//        additionsPrice += additions(add1);
//        additionsPrice += additions(add2);
//        additionsPrice += additions(add3);
//        additionsPrice += additions(add4);
additionsPrice +=extraItem();

        System.out.println();
        System.out.println("The total price to be paid is : $" + (basePrice + additionsPrice + priceAdd ));

        return additionsPrice;
    }
}
