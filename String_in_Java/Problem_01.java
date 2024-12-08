/*Given a string containing a username in mixed case (e.g., "JohnDoe"), write a method to format the username 
such that the first letter is uppercase and the rest are lowercase (e.g., "Johndoe"). Use substring(), toUpperCase(), and toLowerCase() methods.
*/


package lolita;

import java.util.Scanner;

public class Lolita{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name : ");
        String s=scan.nextLine();
       String s1 = s.toLowerCase();
       String s2 = s1.substring(0,1);
       String s3 = s2.toUpperCase();
       
        String finalname = s3 + s1.substring(1);
        System.out.println("Name : "+finalname);
        
        
        
    }
    
}
