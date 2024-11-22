/*Write a Java program to create an interface Shape with the getArea() method  
Create three classes Rectangle, Circle, that implement the Shape interface. Implement the getArea() method for each of the two classes.*/


interface shape {
    double getArea();
}

class Rectangle implements shape {
  int length, width;
    Rectangle(int a, int b) {
        length = a;
        width = b;
    }
    @Override
    public double getArea() {
return length * width;
    }
}


class Circle implements shape {
      int radius;
    Circle(int a)
    {
        radius = a;
    }
     
    @Override
    public double getArea() {
return Math.pow(radius,2) * Math.PI;
    }
}


public class Flag {

    public static void main(String[] args) {

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(5,6);
        System.out.println("Rectangle : "+r.getArea());
        System.out.printf("Circle :  %.2f\n",c.getArea());

    }
}
