/* Write the java program to calculate the sum of prime from 1 to 200 (it will be user defined ) through the multiple threads .
*/


package ftp;

import java.util.Scanner;


/* Write a Java program that calculates the sum of all prime numbers up to a given limit using multiple threads.*/
class MyThread extends Thread {

    int begi, end, sum = 0;

    MyThread(int s, int e) {
        begi = s;
        end = e;
    }
       MyThread(int s, int e,int ob) {
        begi = s;
        end = e;
        sum=ob;
    }


    public void run() {
        for (int i = begi; i <= end; i++) {
            if(isPrime(i)==1){
                System.out.println(" Prime : "+i);
                sum+=i;
            }

        }
    }
    int getSum(){
        
        return sum;
    }

    int isPrime(int a) {
        int flag = 0;
        for (int j = 2; j < a; j++)
        {
            if (a % j == 0) 
            {
                flag = 1;
            }

        }
        if(flag==1){
            return 0;
        }else{
            return 1;
        }

    }

}



public class FTP {

    public static void main(String[] args) {

        System.out.print("Enter The Limit : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print("Enter the No of Threads : ");
        int th = scan.nextInt();
        int range = n / th;
        int rem = n % th;
        int begi = 0, k = range;
        MyThread[] m = new MyThread[th];
        
        
        for (int i = 0; i < th; i++) {
            m[i] = new MyThread(begi + 1, range);
            begi = range;
            range = range + k;
            m[i].start();
            try{
                m[i].join();
            }catch(Exception e){
                
            }
            if(rem!=0 && i==th-1){
                 m[i] = new MyThread(begi + 1,n,m[i].getSum());
                        m[i].start();
                
            }
            
            
            

        }
        
        
        
        for(int i=0; i<th; i++){
            try {
                m[i].join();
            } catch (InterruptedException ex) {
               
            }
            
            
            
        }
        
        int total=0;
        for(int i=0; i<th; i++){
            total+=m[i].getSum();
        }
        
        System.out.println("Total sum of PRime : "+total);
        
        
        
        
        
        
        
    }

}
