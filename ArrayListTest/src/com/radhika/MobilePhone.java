package com.radhika;

import com.radhika.Contact;

import java.util.ArrayList;

/**
 * Created by radhi on 5/19/2017.
 */
public class MobilePhone {

    private String phoneNum;
    private ArrayList<Contact> myContact;


    public MobilePhone(String phoneNum) {
        this.phoneNum = phoneNum;
        this.myContact = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact) {

        if(findContact(contact.getName()) >=0){
            System.out.println("The Contact already Exists");
            return false;
        } else {
            myContact.add(contact);
            return true;
        }
    }

    private int findContact(Contact contact){
        return this.myContact.indexOf(contact);
    }

    private int findContact(String contactName){
        for(int i=0; i< this.myContact.size(); i++ ){
            Contact contact = this.myContact.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {


        if (findContact(contact) >= 0) {
            return contact.getName();
        } else {
            return null;
        }

    }

    public Contact queryContact(String name) {
        int positonQ = findContact(name);
        if (positonQ >= 0) {
            return this.myContact.get(positonQ);
        }
        return null;
    }

    public boolean updateContact(Contact currentName, Contact newName) {

        int positionM = findContact(currentName);
        if (positionM < 0) {
            System.out.println(currentName.getName() + " Was not found");
            return false;
        }
        myContact.set(positionM, newName);
        System.out.println(currentName.getName() + " was replaced with " + newName.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int positionR = findContact(contact);

        if (positionR < 0) {
            System.out.println(contact.getName() + " was not found in the contacts");
            return false;
        }
        myContact.remove(positionR);
        System.out.println(contact.getName()  + " was removed from the contacts");
        return true;
    }

    public void printList() {
        System.out.println("Contact List");
        for (int i = 0; i < myContact.size(); i++) {
            System.out.println((i + 1) + "." + this.myContact.get(i).getName() + "->" + this.myContact.get(i).getPhNumber());
        }
    }
}

