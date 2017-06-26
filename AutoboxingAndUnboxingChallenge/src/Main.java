
/**
 * Created by radhi on 5/29/2017.
 */
public class Main {


    public static void main(String args[]) {


        Bank bank = new Bank("Chase Bank");

        bank.addBranch("Houston Chase");

        bank.addCustomer("Houston Chase", "Radhika", 350.28);
        bank.addCustomer("Houston Chase", "Neeta", 35650.28);
        bank.addCustomer("Houston Chase", "Rohit", 35230.28);

        bank.addBranch("Seattle Chase");
        bank.addCustomer("Seattle Chase", "RadhikaS", 3530.28);

        bank.addTransaction("Houston Chase", "Neeta", 250);
        bank.addTransaction("Houston Chase", "Neeta", 50);
        bank.addTransaction("Seattle Chase", "RadhikaS", 250);


        bank.addBranch("Chicago Chase");


        bank.displayCustomerList("Houston Chase",true);
    }
}
