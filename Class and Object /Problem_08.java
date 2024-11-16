/*Write a Java program to create class called "TrafficLight"
with attributes for color and duration, and methods to 
change the color and check for red or green.
*/
package com.mycompany.mid;
import java.util.Scanner;

class TrafficLight{
    
    String color;
    double duration;
    
    void setter(String color, double duration)
    {
        this.duration = duration;
        this.color = color;
    }
    boolean checkforRED()
    {
       if (color.equals("Red"))
       {
           return true;
       }else{
           return false;
       }
        
    }
    
    
    
    
    
    boolean checkforGreen()
    {
       if (color.equals("Green"))
       {
           return true;
       }else{
           return false;
       }
        
    }
    
}

public class Mid {

    public static void main(String[] args) {
  
    TrafficLight t= new TrafficLight();
 
t.setter("Red",20.5);
        System.out.print("The color is Red : "+t.checkforRED());
        System.out.print("\nDuration : "+t.duration);
    System.out.print("\nThe color is Green : "+t.checkforGreen());
    }
}
