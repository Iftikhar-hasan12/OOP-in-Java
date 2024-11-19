/*Write a Java program to create an abstract class
Shape with abstract methods calculateArea() and calculatePerimeter().
Create subclasses Circle and Triangle that extend the Shape class and implement 
the respective methods to calculate the area and perimeter of each shape.
*/


package com.mycompany.mid;


abstract class Shape {

    double base, height, base2;

    abstract double calculatedArea();

    abstract double calculatedPerimeter();
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatedArea() {
        return radius * radius;
    }

    @Override
    public double calculatedPerimeter() {
        return 2 * Math.PI * radius;

    }

}

class Triangle extends Shape {

    Triangle(double base, double height, double base2) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculatedArea() {
        return .5 * base * height;
    }

    @Override
    public double calculatedPerimeter() {
        return base + height + base2;

    }

}

public class Mid {

    public static void main(String[] args) {
        Circle c = new Circle(5);

        Triangle t = new Triangle(5, 6, 8);

        System.out.println("Cirlce -> Area : " + c.calculatedArea() + " Perimeters : " + c.calculatedPerimeter());

        System.out.println("Triangle -> Area : " + t.calculatedArea() + " Perimeter : " + t.calculatedPerimeter());

    }
}
