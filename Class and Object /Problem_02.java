/* Write a Java program to create a class called "Dog" with a name and breed attribute.
Create two instances of the "Dog" class, set their attributes using the constructor and 
modify the attributes using the setter methods and print the updated values.*/

package com.mycompany.mid;

class Dog {

    private String name, breed;

    Dog(String nm, String brd) {
       name = nm;
        breed = brd;

    }

    void setter(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    void tv() {
        System.out.println("Name : " + name + "\nBreed : " + breed);
    }

}

public class Mid {

    public static void main(String[] args) {
        Dog d = new Dog("Tommy", "Deshi");
        d.tv();
        d.setter("Krish", "Hybrid");
        d.tv();

    }
}
