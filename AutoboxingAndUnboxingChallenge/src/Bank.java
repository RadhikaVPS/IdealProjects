import java.util.ArrayList;

/**
 * Created by radhi on 5/29/2017.
 */

public class Bank {



    private String bankName;
    ArrayList<Branch> branches ;

    public Bank(String bankName){
        this.bankName=bankName;
        this.branches = new ArrayList<Branch>();
    }


    public boolean addBranch( String branchName) {

        if (findBranch(branchName) == null) {

            branches.add(new Branch(branchName));

            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double iniAmt){

        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomer(customerName,iniAmt);
        }
        return false;
    }

    private Branch findBranch(String name){

        for(int i=0; i<this.branches.size();i++){
            Branch returnbranc = this.branches.get(i);
            if(returnbranc.getBranName().equals(name)){
                return returnbranc;
            }
        }
        return null;
    }

    public boolean addTransaction (String branchName, String customerName, double amount){

        Branch exsitingBranch = findBranch(branchName);

        if(exsitingBranch != null){
            exsitingBranch.addCustTransaction(customerName, amount);
            return true;
        }
        return false;
    }

    public boolean displayCustomerList(String branchName, boolean showTransaction) {
        Branch branch = findBranch(branchName);
        if (branchName != null) {
            System.out.println("Customer details for branch " + branch.getBranName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();

            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchcustomer = branchCustomers.get(i);

                System.out.println("Customer name " + branchcustomer.getName() + "[" + (i + 1) + "]");

                if (showTransaction) {

                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchcustomer.getTransaction();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[ " + (j + 1) + "] " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
