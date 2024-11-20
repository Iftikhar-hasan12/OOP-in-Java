/* Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and 
stopEngine(). Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods to 
start and stop the engines for each vehicle type.*/


package com.mycompany.mid;
abstract class vehicle {

    abstract void startEngine();

    abstract void stopEngine();

}

class Car extends vehicle {

    @Override
    public void startEngine() {
        System.out.println("Start Car Engine");
    }

    @Override
    public void stopEngine() {

        System.out.println("Stop Car Engine");

    }

}

class MotorCycle extends vehicle {

    @Override
    public void startEngine() {
        System.out.println("Start MotorCycle Engine");
    }

    @Override
    public void stopEngine() {

        System.out.println("Stop MotorCycle Engine");

    }

}

public class Mid {

    public static void main(String[] args) {

        MotorCycle m = new MotorCycle();
        Car c = new Car();

        m.startEngine();
        m.stopEngine();

        System.out.println("");
        c.startEngine();
        c.stopEngine();

    }
}
