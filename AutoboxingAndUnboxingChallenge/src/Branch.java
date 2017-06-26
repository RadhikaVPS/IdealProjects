import java.util.ArrayList;


/**
 * Created by radhi on 5/29/2017.
 */

public class Branch {

    private String branName;
    ArrayList<Customer> customers ;

    public Branch(String branName){
        this.branName = branName;
        this.customers = new ArrayList<Customer>();
    }

    public String getBranName(){
        return branName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String custName, double iniAmt) {

        if (findCustomer(custName) == null) {

            customers.add(new Customer(custName, iniAmt));

            return true;
        }
        return false;
    }

    public Customer findCustomer(String name){

        for(int i=0; i<this.customers.size();i++){
            Customer returnCust = this.customers.get(i);
            if(returnCust.getName().equals(name)){
                return returnCust;
            }
        }
        return null;
    }


    public boolean addCustTransaction (String custName, double amount) {
        Customer existingCust = findCustomer(custName);

        if(existingCust != null){
            existingCust.addTransactions(amount);
            return true;
        }
        return false;
    }


}
