/*EX-01:  Fibonacci Series and Sum of Fibonacci Series : */


package ftp;

import java.util.Scanner;
public class FTP {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N-th : ");
        int n = scan.nextInt();
        int[] a = new int[n+1];
        a[0]=0;
        a[1]=1;
        for(int i=2; i<n; i++)
        {
            a[i]=a[i-1]+a[i-2];
        }
        
        System.out.print("Fibonacci Series is : ");
        for(int i=0; i<n; i++)
        {
          System.out.print(a[i]+" ");
            sum+= a[i];
        }
        System.out.println("\nSum of Fibonacci : "+sum);
    }}
