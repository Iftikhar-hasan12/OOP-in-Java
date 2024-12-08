/* Write a method to validate if a given string is a valid email address. A valid email should contain 
exactly one "@" and at least one "." after the "@". Use indexOf(), substring(), and isEmpty() methods.*/


package lolita;



import java.util.Scanner;

public class Lolita{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Email  : ");
       String email =scan.nextLine();
         int index = email.indexOf('@');
         int index2 = email.indexOf('@',index+1);
        int dot =email.indexOf(".",index+1);
        String restOfem = email.substring(index+1);
        
        if(index!=-1 && index2 ==-1 && dot !=-1 && restOfem.isEmpty() ==false){
            System.out.println("Valid email");
            return;
        }
        
        System.out.println("Invalid email");
       
       
    }
    
}
