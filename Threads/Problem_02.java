/*.Write a Java program that creates Multiple threads to find sum of numbers from 1 to 200(user-defined) .
*/


package com.mycompany.testp;

import java.util.Scanner;

class A extends Thread {

    int beg, end;
    int sum = 0;
    A(int a, int b) {
        beg = a;
        end = b;
    }
A(int a, int b, int ob) {
        beg = a;
        end = b;
        sum=ob;
        System.out.println("value : "+sum);
    }


    public void run() {
        for (int i = beg; i <= end; i++) {
            sum += i;
            System.out.println("Sum : "+sum );

        }

    }

    int Getsum() {
        return sum;
    }

}

public class Testp {

    public static void main(String[] args) {

        int beg = 0, end, range, n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The last number : ");
        end = scan.nextInt();
        System.out.print("Enter the No of thread : ");
        n = scan.nextInt();
        range = end / n;
        int k = range;
        int rem = end % n;

        A[] a = new A[n];
        for (int i = 0; i < n; i++) {
            a[i] = new A(beg + 1, range);
            beg = range;
            range = range + k;
            a[i].start();
            try {
                a[i].join();
            } catch (InterruptedException ex) {

            }
            
            
            
            
            if(rem!=0 && i == n-1){
                System.out.println("i = "+i + "  sum  : "+a[i].Getsum());
                a[i] = new A(beg + 1, end,a[i].Getsum());
                   a[i].start();
            }

        }

        
           for (int i = 0; i < n; i++) {
            try {
                a[i].join();

            } catch (Exception e) {

            }
        }
       
        
        
        
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += a[i].Getsum();

        }

        int s = 0;

        System.out.println("Total sum : " + total);
        for (int i = 0; i <= end; i++) {

            s += i;
        }
        System.out.println("Manually count : " + s);

    }

}
