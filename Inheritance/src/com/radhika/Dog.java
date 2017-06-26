package com.radhika;

/**
 * Created by radhi on 4/15/2017.
 */
public class Dog extends Animal {
    private String breed;
    private int legs;
    private int tail;
    private int teeth;


    public Dog(String name, int coat, String breed, int legs, int tail, int teeth){
        super(1,name,1,coat);
        this.breed=breed;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
    }
    public void chew (){
        System.out.println("I chew food!");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat Here!");
        chew();
        super.eat();
    }

    public String getBreed() {
        return breed;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    public int getTeeth() {
        return teeth;
    }


}
