/*Write a Java program to create a class called Shape with methods called getPerimeter() 
and getArea(). Create a subclass called Circle that overrides the getPerimeter() and getArea() 
methods to calculate the area and perimeter of a circle.
*/

package com.mycompany.mid;

class Shape {

    private double radius;

    Shape(double radius) {
        this.radius = radius;

    }

    double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }
}

class Circle extends Shape {

    Circle(double radius) {

        super(radius);

    }

    double getPerimeter() {
        return super.getPerimeter();
    }

    double getArea() {
        return super.getArea();
    }

}

public class Mid {

    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.printf("Area : %.2f  Perimeters : %.2f " , c.getArea() , c.getPerimeter());

    }
}
