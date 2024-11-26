/*Write a Java program to create a method
     that takes a string as input and throws an exception 
     if the string does not contain vowels.
*/

package ftp;

import java.util.Scanner;

public class FTP {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        System.out.print("Enter the String : ");
        s = scan.nextLine();

        try {
            check(s);
            System.out.println("It has vowels ");
        } catch (Exception e) {
            System.out.println("It does not have any vowels !!");
        }

    }

    public static void check(String a) throws Exception {
        int flag = 0;
        char[] ar = a.toCharArray();
   
        for (int i = 0; i <a.length(); i++) {
            if (ar[i] == 'a'  || ar[i] == 'e' || ar[i] == 'i' || ar[i] == 'o' || ar[i] == 'u' || ar[i] == 'A' || ar[i] == 'E' || ar[i] == 'I' || ar[i] == 'O' || ar[i] == 'U')
            {
                flag = 1;
                System.out.println(ar[i]);
            }

        }
        if (flag == 0) {
             
            throw new Exception();
        }

    }

}
