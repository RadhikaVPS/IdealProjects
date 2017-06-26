import java.util.ArrayList;

/**
 * Created by radhi on 5/29/2017.
 */

public class Customer {

    ArrayList<Double> transaction ;

    private String name;


    public Customer( String name, double initBalance){
        this.name=name;
        this.transaction = new ArrayList<Double>();
        addTransactions(initBalance);
    }

    public void addTransactions(double amt){
        transaction.add(amt);
    }
    public String getName (){
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }
}
