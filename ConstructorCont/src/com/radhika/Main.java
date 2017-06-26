package com.radhika;

public class Main {

    public static void main(String[] args) {

        VipCustomer vip =new VipCustomer();
        VipCustomer vip2 =new VipCustomer("radhi","mjui@gmail.com");
        VipCustomer vip3 =new VipCustomer("abhishek","abhi@gmail.com",2400);

        System.out.println(vip.getName());
        System.out.println(vip.getEmail());
        System.out.println(vip.getCreditLimit());

        System.out.println("##################################");

        System.out.println(vip2.getName());
        System.out.println(vip2.getEmail());
        System.out.println(vip2.getCreditLimit());

        System.out.println("##################################");

        System.out.println(vip3.getName());
        System.out.println(vip3.getEmail());
        System.out.println(vip3.getCreditLimit());






    }
}
