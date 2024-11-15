/* Write a Java program to create a class called "Circle" with a radius attribute.
You can access and modify this attribute. Calculate the area and circumference of the circle.
*/

package com.mycompany.mid;

class circle {

    double radius;

    void setter(double radius) {
        this.radius = radius;
    }

    void tv() {
        System.out.println("Area : " + (3.14 * radius * radius) + "\nCircumference : " + (2 * 3.14 * radius));

    }
}

public class Mid {

    public static void main(String[] args) {
        circle c = new circle();
        c.setter(5.5);
        c.tv();

    }
}
