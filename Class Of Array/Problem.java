/* Deal with class by considering an Array*/

package ftp;

import java.util.Scanner;

class A {

    int[] ar;

    A(int[] a) {
        ar = a;
    }

    void fun() {
        for (int x : ar) {
            System.out.println(x);
        }
    }
}

public class FTP {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = scan.nextInt();
            int[] a= new int[n];
            System.out.print("Enter "+n+" elements : ");
            for(int i=0; i<n; i++)
            {
                a[i]=scan.nextInt();
            }
            
        A ob = new A(a);
        System.out.println("Inserted Array : ");
        ob.fun();
    }

}
