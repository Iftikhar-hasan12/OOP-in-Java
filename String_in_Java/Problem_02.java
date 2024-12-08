/*Write a method that takes a CSV (comma-separated values) string 
(e.g., "John,Doe,25,Student") and splits it into an array of strings. 
Then, convert each element to uppercase. Use split() and toUpperCase() methods
*/

package lolita;

import java.util.Scanner;

public class Lolita{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name : ");
       String name =scan.nextLine();
       String[] sr = name.split(",");
       for(String x :sr ){
           System.out.println(x.toUpperCase());
       }
       
    }
    
}
