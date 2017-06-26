package com.radhika;

/**
 * Created by radhi on 4/14/2017.
 */
public class VipCustomer {

    private String name;
    private String email;
    private int creditLimit;

    public VipCustomer() {
        this("radhika","abc@gmail.com",1600);
    }

    public VipCustomer(String name, String email) {
        this(name,email,1500);
//        this.name = name;
//        this.email = email;

    }

    public VipCustomer(String name, String email, int creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getCreditLimit() {
        return creditLimit;
    }
}
