/*Write a Java program to create an interface Resizable with methods resizeWidth(int width) and
resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that implements the
Resizable interface and implements the resize methods.*/

package ftp;

interface A {

    void resizeHeight(int h);

    void resizeWeight(int w);

}

class Rectangle implements A {

    private int height, weight;

    Rectangle(int h, int w) {
        height = h;
        weight = w;
    }

    @Override
    public void resizeHeight(int h) {
        height = h;

    }

    @Override
    public void resizeWeight(int w) {
        weight = w;
    }

    void print() {
        System.out.println("Height  : " + height + " \n Weight : " + weight);
    }

}

public class FTP {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 20);
        r.print();
        r.resizeHeight(30);
        r.resizeWeight(40);
        r.print();

    }
}
