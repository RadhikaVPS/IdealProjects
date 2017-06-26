package com.radhika;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("469 773 9796");


    public static void main(String[] args) {

        int choice = 0;
        displayOptions();
        boolean flag = false;


        while (!flag) {
            System.out.println("Select one to perform");

            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 0:
                    addNewContact();
                    break;
                case 1:
                    updateExsistingContact();
                    break;
                case 2:
                    removeExistingContact();
                    break;
                case 3:
                    queryContactName();
                    break;
                case 4:
                    mobilePhone.printList();
                    break;
                case 5:
                    displayOptions();
                    break;
                case 6:
                    System.out.println("\t Shutting Down");
                    flag = true;
            }
        }
    }

    private static void displayOptions() {

        System.out.println("\t Select one");
        System.out.println("\t 0 - Create New Contact");
        System.out.println("\t 1 - Modify Contact");
        System.out.println("\t 2 - Delete Contact");
        System.out.println("\t 3 - Search Contact");
        System.out.println("\t 4 - Display Contacts List");
        System.out.println("\t 5 - Back to Actions list");
        System.out.println("\t 6 - Quit");
        System.out.println("Choose your options");

        }

        public static void addNewContact(){
            System.out.println("Enter new contact Name");
            String name = scan.nextLine();
            System.out.println("Enter new contact Number");
            String phNum = scan.nextLine();
            Contact contact = Contact.createContact(name, phNum);
            if(mobilePhone.addContact(contact)){
                System.out.println("New Contact added with : name " + name + " Phone Number " + phNum);
            }else{
                System.out.println("Cannot Add Contact already exists");
            }
        }

        public static void updateExsistingContact(){
            System.out.println("Enter the name of contact to edit");
            String name = scan.nextLine();
            Contact searchContact = mobilePhone.queryContact(name);
            if(searchContact == null){
                System.out.println("Contact not Found");
                return;
            }
            System.out.println("Enter the new name to modify");
            String newName = scan.nextLine();
            System.out.println("Enter the new phone number to modify");
            String newNum = scan.nextLine();
            Contact contact = Contact.createContact(newName, newNum);
            if(mobilePhone.updateContact(searchContact, contact)){
                System.out.println("Contact updated successfully");
            }else
                System.out.println("Error in updating");
        }

        public static void removeExistingContact(){
            System.out.println("Enter the name of contact to remove");
            String name = scan.nextLine();
            Contact searchContact = mobilePhone.queryContact(name);

            if(searchContact == null){
                System.out.println("Contact doesn't exists");
            }
            if(mobilePhone.removeContact(searchContact)){
                System.out.println("Contact deleted successfully");
            }else
                System.out.println("Error in deleting contact");
        }

        public static void queryContactName(){
            System.out.println("Enter the name of contact to search");
            String name = scan.nextLine();
            Contact searchContact = mobilePhone.queryContact(name);

            if(searchContact == null) {
                System.out.println("Contact doesn't exists");
            }else {
                System.out.println("Name: " + searchContact.getName() + " with phone number " + searchContact.getPhNumber());
            }
        }
}
