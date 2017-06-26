package com.radhika;

public class Main {

    public static void main(String[] args) {
//         for (int i=8; i>=2; i--){
//             System.out.println("10,0000 at " + i + "% interest = " + "$" + String.format("%.2f",calculateInterest(10_000, i)));

        int count = 0;
        for (int i = 1; i <= 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i + " is a prime number");
                if(count==3){
                    System.out.println("Exiting For Loop");
                    break;

                }
            }
        }
    }

//    public static double calculateInterest(double amount, double interesrRate){
//        return (amount * (interesrRate/100);

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int j = 2; j <= n / 2; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
}
