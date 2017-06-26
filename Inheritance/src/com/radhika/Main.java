package com.radhika;

public class Main {

    public static void main(String[] args) {

        Animal animal =new Animal(2,"prince",2,1);

        Dog puppy =new Dog("brunno",4,"lab",4,1,24);
        puppy.eat();

//        System.out.println("Name : " + animal.getName() +'\n' + "Body : " + animal.getBody() +'\n' + "Brain : " + animal.getBrain() +'\n' + "coat : " + animal.getCoat() );
//
//        System.out.println("Name " + puppy.getName() +'\n' +  "Body : " + puppy.getBody() +'\n' +  "Brain : " + puppy.getBrain() +'\n' +  "coat : " + puppy.getCoat() +'\n' + "Breed : " + puppy.getBreed()+'\n' + "Legs : " + puppy.getLegs() +'\n' + "Tail : " + puppy.getTail() +'\n' + "Teeth : " + puppy.getTeeth());

    }
}
