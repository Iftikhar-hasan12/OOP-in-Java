/*Write a Java program to create a class called Vehicle
with a method called drive(). 
Create a subclass called Car that overrides the drive() method 
to print "Repairing a car"
*/

package com.mycompany.mid;


class vahicle {

    void drive() {
        System.out.print("I can Drive ");
    }

}

class Car extends vahicle {

    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

public class Mid {

    public static void main(String[] args) {

        vahicle c = new Car();
        c.drive();

    }
}
