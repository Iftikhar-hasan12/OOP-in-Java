/*Write a Java program to create an abstract class Shape3D with abstract methods
calculateVolume() and calculateSurfaceArea(). Create subclasses Sphere and Cube that extend 
the Shape3D class and implement the respective 
methods to calculate the volume and surface area of each shape.*/

package com.mycompany.mid;
abstract class Shape3D {

    double radius;

    Shape3D(double radi) {
        this.radius = radi;
    }

    abstract double calculateVolume();

    abstract double calculateSurfaceArea();

}

class Sphere extends Shape3D {

    Sphere(double radius) {
        super(radius);
    }

    @Override
    public double calculateVolume() {
        return radius * radius * radius;
    }

    @Override
    public double calculateSurfaceArea() {

        return radius * radius;

    }

}

class Cube extends Shape3D {

    Cube(double radius) {
        super(radius);

    }

    @Override
    public double calculateVolume() {
        return radius * radius * radius;
    }

    @Override
    public double calculateSurfaceArea() {

        return radius * radius * radius;

    }

}

public class Mid {

    public static void main(String[] args) {

        Sphere s = new Sphere(3.0);
        Cube c = new Cube(5);
        System.out.println("Sphere 3.0  Area : " + s.calculateSurfaceArea() + " Volume : " + s.calculateVolume());
        System.out.println("Cube  5  Area : " + c.calculateSurfaceArea() + " Volume : " + c.calculateVolume());

    }
}
