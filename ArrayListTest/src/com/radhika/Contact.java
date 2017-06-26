package com.radhika;

/**
 * package com.radhika;

 /**
 * Created by radhi on 5/19/2017.
 */
public class Contact {

    private String name;
    private String phNumber;


    public Contact(String name, String phNumber) {

        this.name = name;
        this.phNumber = phNumber;
    }

    public String getName() {

        return name;
    }

    public String getPhNumber() {

        return phNumber;
    }

    public static Contact createContact(String name, String phNumber){
        return new Contact(name,phNumber);
    }
}

