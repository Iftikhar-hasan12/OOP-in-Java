/*Write a method to check the strength of a password. A strong password must be at least 8 characters long, 
contain at least one uppercase letter, one lowercase letter, and one digit. Use methods .*/

package lolita;

import java.util.Scanner;

public class Lolita {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String pass;
        System.out.println("Enter Password : ");
        pass = scan.nextLine();
        int upC=0,lC=0,d=0,len=0;

        for (int i = 0; i < pass.length(); i++) {
            char c = pass.charAt(i);
            if(Character.isLowerCase(c)){
                lC=1;
            }
            if(Character.isUpperCase(c)){
                upC=1;
            }
            if(Character.isDigit(c)){
                d=1;
            }
            if(pass.length()>=8)
            {
                len=1;
            }
        }
        
        if(lC==1 && upC==1 && d==1 && len ==1){
            System.out.println("Password is Strong ");
        }else {
            System.out.println("Password is not Strong ");
        }

    }

