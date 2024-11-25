/*
Write a Java program that throws an exception and catch it using a try-catch block.
*/
package ftp;
 
public class FTP {

    public static void main(String[] args) {
        int result=0;
try{
     result = divided(10,0);
 
}catch(ArithmeticException e){
    System.out.println("Error occured "+e.getMessage());
    result = 10/1;
}
    finally{
     System.out.println("Result : "+result);
}

    }
    
     public static int divided(int a,int b) throws ArithmeticException{
     
        if(b==0){
           throw new  ArithmeticException("Zero can't perform divition ");
        }else{
            return a/b;
        }
    }
    
    
    
}
