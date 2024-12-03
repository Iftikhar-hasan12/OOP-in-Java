/*Prime Number Found by thread out of 200*/

import java.util.Scanner;
 class PrimeTest extends Thread {

    int start;
    int end;
    int id;

    PrimeTest(int id, int start, int end) {
        this.start = start;
        this.end = end;
        this.id = id;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (checkPrime(i) == true) {
                System.out.println("Thread " + this.id + " generated " + i);
                try {
                    sleep(100);
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    public boolean checkPrime(int x) {
        // Skip 0 and 1 as they are neither prime nor composite
        if (x == 1 || x == 0) {
            return false;
        }
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Lab_thread_practice {

 public static void main(String[]args){
  Scanner sc= new Scanner(System.in);
  System.out.print("Enter M = ");
  int M=sc.nextInt();
  System.out.print("Enter N = ");
  int N=sc.nextInt();
  int start=0;
  int rangeSize=M/N;
  for(int i=1;i<=N;i++){
  PrimeTest t= new PrimeTest(i,start+1,start+rangeSize);
  start=start+rangeSize;
  t.start();
  }
  }
  }
