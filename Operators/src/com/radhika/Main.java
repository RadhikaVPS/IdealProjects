package com.radhika;

public class Main {

    public static void main(String[] args) {
       // int result = 1 + 2;
       //System.out.println("1 + 2 = " + result);

      //  int previousResult = result;

      //  result = result - 1;
      //  System.out.println(previousResult + " - 1 = " + result);

      //  previousResult = result;

      //  result = result * 10;
      //  System.out.println(previousResult + " * 10 = " + result);

       // previousResult = result;

      //  result = result /5;
      //  System.out.println(previousResult + " /5 = " + result);

      //  previousResult = result;

       // result = result - 1;
       // System.out.println(previousResult + " - 1 = " + result);


        double myFirstDoubleValue = 20;
        double mySecondDoubleValue = 80;
        double result;

        result = myFirstDoubleValue + mySecondDoubleValue *25;

        //result = result*25;

        System.out.println("My result is : " + result);

        double displayValue = result %40;

        System.out.println("My remainder is : " + displayValue);

        if(displayValue<=20)
            System.out.println("Total was over the limit");


    }
}
