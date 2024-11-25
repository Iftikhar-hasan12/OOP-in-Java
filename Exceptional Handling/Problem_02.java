/*Write a Java program to create a method that takes an integer as a
parameter and throws an MyException if the number is odd*/


package ftp;

import java.util.Scanner;

class MyException extends Exception {

    MyException(String s) {
super(s);
    }
}

public class FTP {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        try {
            System.out.print("Enter : ");
            a = scan.nextInt();
            check(a);
 System.out.println("Even");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void check(int a) throws MyException{
        if (a % 2 != 0) {
            throw new MyException("Odd");
        }else{
           
        }

    }

}
