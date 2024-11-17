/*Write a Java program to create a class called Shape with a method called getArea().
Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle*/

package com.mycompany.mid;
class Shape{
    double len, wdt;
    
    double getArea()
    {
        return 0;
    }
}

class Rectangle extends Shape{
    
    void setter(double len, double wdt)
    {
        this.len= len;
        this.wdt = wdt;      
    }
    
        @Override
        double getArea()
        {
            return len*wdt;
        }
}

public class Mid {

    public static void main(String[] args) {

      Rectangle  c =  new Rectangle();
            c.setter(5.50, 6.80);
        System.out.print("Area : "+c.getArea());
    }
}
