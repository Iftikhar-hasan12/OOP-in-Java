/*Write a Java program to create a class called Animal with a method called makeSound(). 
Create a subclass called Cat that overrides the makeSound() method to bark.*/

package com.mycompany.mid;

class Animal{
    void makesound()
    {
        System.out.println("I can talk");
    }
}

class Cat extends Animal {

             
     void makesound()
     {
         System.out.println("I can Bark");
     }
}



public class Mid {

    public static void main(String[] args) {
        Animal s = new Cat();
        s.makesound();
        
        
      
    }
}
