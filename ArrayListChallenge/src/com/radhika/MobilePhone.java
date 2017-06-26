package com.radhika;

    import java.util.ArrayList;

    /**
     * Created by radhi on 5/19/2017.
     */
    public class MobilePhone {

        private int phoneNum;
        private ArrayList<Contact> myContact;


        public MoblilePhone(String phoneNum) {
            this.phoneNum = phoneNum;
            this.myContact = new ArrayList<Contact>();
        }

        public boolean addContact(Contact contact) {

            int position = myContact.indexOf(contact);

            if (position >= 0) {
                System.out.println("The Contact already Exists");
                return true;
            } else {
                myContact.add(contact);
                return false;
            }
        }


        public void queryContact(Contact contact) {

            int position = myContact.indexOf(contact);

            if (position >= 0) {
                System.out.println("Contact found in the contact list");
                this.myContact.get(contact);
            } else {
                System.out.println("Contact not found in the contact list");
            }

        }

        public void modifyContact(Contact currentName, Contact newName){

            int positionM = myContact.indexOf(currentName);
            myContact.set(positionM, newName);
        }

        public void removeContact(String removeName){
            int positionR = contact.indexOf(removeName);

            contact.remove(positionR);
        }
    }





