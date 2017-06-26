package com.radhika;

public class Main {

    public static void main(String[] args) {
//        int count = 0;
//        while (count != 10) {
//            System.out.println("count is equal to " + count);
//            count++;
//        }
//        System.out.println("***************************");
//        count = 1;
//        do {
//            System.out.println(count + " Hello!");
//            count++;
//        }
//        while (count != 10);


        int number = 10;
        int lastNumber = 50;
        int count = 0;
        while (number <= lastNumber) {
            if (!isEvenNumber((number))) {
                number++;
                continue;
            }
            System.out.println("Even Number " + number);
            number++;
            count++;
            if (count == 5) {
                System.out.println("The total number of Even numbers are " + count);
                break;
            }
         }

    }


    public static boolean isEvenNumber(int number){
        if((number % 2) == 0){
            //System.out.println(number + "is a Even number");
            return true;
        }
        //System.out.println(number + " is not an Even number");
        return false;
    }
}

