/*Write a Java program to create an abstract class Animal with an abstract method called sound(). 
Create subclasses Lion and Tiger that extend the Animal class and implement the sound() 
method to make a specific sound for each animal.*/

package com.mycompany.mid;

abstract class Animal{
   public abstract void sound();
   
}
 class Lion extends Animal{
     
     @Override
     public void sound()
     {
         System.out.println("Lion Roaring ");
     }
 }

    class Tiger extends Animal{
        
        @Override
        public void sound()
        {
            System.out.print("Tiger Growling ");
        }
    }
    

public class Mid {

    public static void main(String[] args) {
  
        Lion p = new Lion();
        p.sound();

        
        Tiger T = new Tiger();
        T.sound();
    }
}
