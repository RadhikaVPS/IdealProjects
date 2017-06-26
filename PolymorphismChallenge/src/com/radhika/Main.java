package com.radhika;


class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.engine = true;
        this.wheels = 4;
        this.name = name;
        this.cylinders = cylinders;

    }

    public void startEngine() {
        if (engine) {

            System.out.println("The car is ready to move");
        } else {
            System.out.println("Car is at rest");
        }
    }

    public void accelerate() {
        System.out.println("The car is accelerating");
    }

    public String brake() {
        return "No brake system";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}


class Audi extends Car {

    public Audi() {
        super("Audi", 4);
    }

    public String brake() {
        return  getClass().getSimpleName() + " brake system";
    }

}

class Ferrari extends Car {

    public Ferrari() {
        super("Ferrari" ,2);
    }

    public String brake() {
        return  getClass().getSimpleName() + " brake system";    }
}

class Mustang extends Car {

    public Mustang() {
        super("Mustang", 3);
    }
}

public class Main {

    public static void main(String[] args) {


        for (int i = 1; i <= 4; i++) {

            Car car = randomCar();
            System.out.println("Car #" + i + ": " + car.getName() + "\n" + "Total cylinders :" + car.getCylinders() + "\n" + "Brake System : " + car.brake());
            System.out.println();
        }
    }

        public static Car randomCar(){

        int randomNumber = (int)(Math.random()*3)+1;

            System.out.println("Random number generated is : " + randomNumber);

            switch(randomNumber){

                case 1:
                    return new Audi();

                case 2:

                    return new Ferrari();

                case 3:
                    return new Mustang();
            }
            return null;
        }
    }

