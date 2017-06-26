package com.radhika;

/**
 * Created by radhi on 4/14/2017.
 */
public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;


    public BankAccount(){
        this("100002010", 1000.00,"abc@gmail.com","Radhika","4697737910");

    }

    public BankAccount(String accountNumber, double accountBalance, String customerEmail, String customerName, String phoneNumber){

        this.accountBalance=accountBalance;
        this.accountNumber=accountNumber;
        this.customerEmail=customerEmail;
        this.phoneNumber= phoneNumber;
        this.customerName=customerName;
    }

//    public void setAccountNumber(String accountNumber) {
//
//        this.accountNumber = accountNumber;
//    }
//
//    public void setAccountBalance(double accountBalance) {
//        this.accountBalance = accountBalance;
//    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public void setCustomerEmail(String customerEmail) {
//        this.customerEmail = customerEmail;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void depositeFunds(double add) {

        this.accountBalance = this.accountBalance + add;
        System.out.println("Deposite Amount = " + add + "Available Balance = $" + this.accountBalance);

        //return accountBalance;
    }

    public void withdrawFunds(double substract) {

        if (this.accountBalance > substract) {
            this.accountBalance = this.accountBalance - substract;
            System.out.println("Withdraw Amount = " + substract + "Available Balance = $" + this.accountBalance);

        } else {
            System.out.println("Insufficient Balance");
        }
        //return accountBalance;


    }


}
