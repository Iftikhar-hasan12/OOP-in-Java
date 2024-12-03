/* Thread to find the index from the array*/


package ftp;

import java.util.Random;
import java.util.Scanner;

public class FTP {

    public static int[] a = new int[200];

    static class A extends Thread {
        int item, start, end, id;

        A(int d, int b, int c, int a) {
            item = a;
            start = b;
            end = c;
            id = d;
        }

        @Override
        public void run() {
            for (int i = start; i <= end; i++) {
                if (FTP.a[i] == item) {
                    System.out.println("Thread No : " + id + " Found at index : " + i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter (3 digit)Range (1-200) the item to search : ");
        int item = scan.nextInt();
        int range = 200 / 5; // jehetu tor data hoilo 200 r thread hoilo 5 ta , tai ekta thread pay 40 ta koira
        // mane main kahini ta bujh, 1 ta thread 40 ta niya kaaj korbo , so 4 ta ek loge milla 200 ta
        int start = 0;

        Random random = new Random();
        for (int i = 0; i < 200; i++) {
          //  a[i] = random.nextInt(1000); // eita hoilo tui jdi 1 to 999 porjotno random data niya kaaj koros
            a[i] = 1 + (int) (Math.random() * 200); // eita hoilo 1 theke 200 random data niya kaaj 
        }
for(int i=0; i<200; i++){
    System.out.println(a[i]);
}
        for (int i = 1; i <= 5; i++) {
            A obj = new A(i, start, range + start-1, item);
            start = start + range;
            obj.start();
        }
    }
}
