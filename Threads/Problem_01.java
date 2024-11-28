/*Write a Java program to create a basic Java thread that prints " Hello, World!" when executed*/

package ftp;



class A extends Thread {

    public void run() {
        System.out.println("Hello World!");
    }
}

class B implements Runnable {

    public void run() {
        System.out.println("Hello World!");
    }
}

public class FTP {

    public static void main(String[] args) {
          // When we directly extends Thread class
        A a = new A();
        a.start();

        //When we use runnable interface instead of using extanding thread class 
        B b = new B();
        Thread t = new Thread(b);
        t.start();

    }

}
