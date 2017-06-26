/**
 * Created by radhi on 4/8/2017.
 */
import java.util.Scanner;

public class Main {


    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Pounds Value");

        double myPoundsValue;

        myPoundsValue = scan.nextDouble();


        double myKilogramsValue =  0.45359237 * myPoundsValue;

        System.out.println(myKilogramsValue);
    }
}
