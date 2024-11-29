/*Write a java program to calculate the sum of the square matrix : */

import java.util.Scanner;


class MyThread extends Thread {

    private int sum = 0,begi,end;
    int[][] a;
int n;
    MyThread(int a,int b,int n) {
       
        begi =a;
        end =b;
        this.n=n;
    }

    public void run() {
        
        for(int row =begi; row<end; row++){
            
            for(int col =0; col<n; col++){
                sum+= a[row][col];
            }
            
        }
    }

    int getSum() {
        return sum;
    }

}

public class FTP {

    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of square Matrix ");
        int n=scan.nextInt();
        int[][] mat = new int[n][n];
int sum =0;
        System.out.println("Enter Data ");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                
               int val = scan.nextInt();
                        sum +=val;
                 mat[row][col] =val;
                
            }
        }
        
        System.out.println("Entered Matrix : " );
        
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                
                System.out.print(" "+mat[row][col]);
                
            }
            System.out.println("");
        }
        
        
        
       

        MyThread[] t= new MyThread[n];
        for(int i=0; i<n; i++)
        {
            
           t[i] = new MyThread(i,i+1,n);
            t[i].a=mat;
            t[i].start();
            
            
            try{
               t[i].join();
            }catch(Exception e){
                
            }
    
            
            
        }
        
        
        int totalsum=0;
        
        for(int i=0; i<n; i++)
        {
            
          totalsum+= t[i].getSum();
    
            
            
        }
       
       
        
        
        System.out.println("Manually counted sum : "+sum);
        System.out.println("Thread count the sum : "+totalsum);
        
        

    }

}
