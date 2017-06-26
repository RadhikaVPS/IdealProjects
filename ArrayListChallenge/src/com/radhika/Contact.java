package com.radhika;

/**
 * Created by radhi on 5/19/2017.
 */
public class Contact  {

    private String name;
    private int phNumber;


    public com.radhika.Contact (String name, int phNumber){

        this.name=name;
        this.phNumber= phNumber;
    }

    public String getName() {
        return name;
    }

    public int getPhNumber() {
        return phNumber;
    }

//    public void storeContact (String nameNew, int phNumberNew) {
//
//        int position = contact.indexOf(nameNew);
//
//        if (position >= 0) {
//            System.out.println("The com.radhika.Contact already Exists");
//        } else {
//            contact.add(phNumberNew, nameNew);
//        }
//    }

    public void modifyContact(String currentName, String newName){

        int positionM = contact.indexOf(currentName);
        contact.set(positionM, newName);
    }

    public void removeContact(String removeName){
        int positionR = contact.indexOf(removeName);

        contact.remove(positionR);
    }


    public void queryContact(String contactName){

        int position = contact. indexOf(contactName);

        if(position>=0){
            System.out.println("com.radhika.Contact found in the contact list");
        }else {
            System.out.println("com.radhika.Contact not found in the contact list");
        }

    }

}
