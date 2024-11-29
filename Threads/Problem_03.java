/*.Write a Java program that creates Multiple threads to count the even  of numbers from 1 to 200(user-defined) .
*/


package ftp;

import java.util.Scanner;


/*Write a Java program that creates 5 threads to count the total even  numbers from 1 to 200*/
class EvenCount extends Thread {

      int  count = 0;
    int start, end;

    EvenCount(int s, int e) {
        start = s;
        end = e;
    }
    
    EvenCount(int s, int e,int j) {
        start = s;
        end = e;
        count = j;
        
    }
    

    public void run() {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                count++;
              
                System.out.println("Thread name " + Thread.currentThread().getName() +"  Check value : "+i +"  Count : " + getCount());
            }
        }
         System.out.println("Beginnig : "+start+ "  End  : "+end+" sum >>  "+count);

    }

    int getCount() {
        return count;
    }
}

public class FTP {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num, t;
        int start1 = 0;
        System.out.println("Enter End number  : ");

        num = scan.nextInt();

        System.out.println("Enter the Desire Threads : ");
        t = scan.nextInt();

        int range = num / t;
        int rem = num % t;
        int k = range;
        EvenCount[] a = new EvenCount[t + 1];

        for (int i = 0; i < t; i++) {
            a[i] = new EvenCount(start1 + 1, range);
            start1 = range;
            range = range + k;
            a[i].start();
            
            
            
            
            
            System.out.println("Pass "+i);
            try {
                a[i].join();
            } catch (InterruptedException ex) {

            }
            
             if (rem != 0 && i==t-1 ) {
            a[i] = new EvenCount(start1 + 1, num,a[i].getCount());
            a[i].start();
        }
            
            
            
            
            
            
        }

       

//        for (int i = 0; i < t; i++) {
//            try {
//                a[i].join();
//
//            } catch (Exception e) {
//
//            }
//        }

        int TotalCount = 0;
        for (int i = 0; i < t; i++) {

            System.out.println(i + " >> Count in each array : " + a[i].getCount());
            TotalCount += a[i].getCount();
        }

        System.out.println("Total Even is : " + TotalCount);


    }
}
