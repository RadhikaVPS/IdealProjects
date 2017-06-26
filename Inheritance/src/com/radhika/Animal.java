package com.radhika;

/**
 * Created by radhi on 4/15/2017.
 */
public class Animal {

    private int brain;
    private String name;
    private int body;
    private int coat;

    public Animal(int brain, String name, int body, int coat){
        this.brain=brain;
        this.name=name;
        this.body=body;
        this.coat=coat;
    }

    public void eat(){

        System.out.println("Animal.eat Here!");

    }

    public void move(){

    }

    public int getBrain(){
        return brain;
    }

    public String getName(){
        return name;
    }

    public int getBody(){
        return body;
    }

    public int getCoat(){
        return coat;
    }
}
