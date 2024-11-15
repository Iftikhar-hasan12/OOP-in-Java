/* Write a Java program to create a class called "Rectangle" with width and height attributes. 
Calculate the area and perimeter of the rectangle.
*/ 
package com.mycompany.mid;

class Rectangle {

    double width, height;

    Rectangle(double h, double w) {
        height = h;
        width = w;

    }

    void tv() {

        System.out.println("Area : " + (width * height) + "\nPerimeter : " + (2 * (height + width)));

    }

}

public class Mid {

    public static void main(String[] args) {
        Rectangle R = new Rectangle(5, 6.9);

        R.tv();
    }
}
