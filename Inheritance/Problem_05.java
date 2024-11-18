/*Write a Java program to create a class called Animal with a method named move(). 
Create a subclass called Cheetah that overrides the move() method to run.*/

package com.mycompany.mid;

class Animal{
    void move()
    {
        System.out.println("Animal Move");
        
    }
}

class Cheetah extends Animal{
  
    
    @Override
    void move()
    {
        System.out.println("Cheetah Move ");
        
    }
    
}

public class Mid {

    public static void main(String[] args) {
 
        Animal a = new Animal();

        a.move();
             a = new Cheetah();
                    a.move();
    }
}
