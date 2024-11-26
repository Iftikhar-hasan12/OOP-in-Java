/* A banking system needs to handle a scenario where a user tries to withdraw more
money than their account balance. And also throw a exception when negative or zero balance try to deposit 
Implement this using custom exceptions and proper exception handling.
*/

package ftp;



class CustomException extends Exception {
    
    CustomException(String s){
 
        super(s);
    }
}

class Bank{
   int balance; 
    Bank(int a){
        balance =a;
    }
    
    void deposite(int amnt)throws CustomException{
        if(amnt <=0){
            throw new CustomException("Negative Monery or zero  can't be inserted ");
        }else {
            balance =+amnt;
        }
    }
    void withdraw(int amnt) throws CustomException{
        if(amnt > balance ){
             throw new CustomException("Insufficient ....");
        }else {
            System.out.println("Successfully Withdraw..");
        }
        
    }
    
      
}


public class FTP {

    public static void main(String[] args) {
        
    Bank a = new Bank(1000);
    try{
   // a.withdraw(7000);
    a.deposite(000);
    }catch(CustomException e){
        System.out.println("Error : "+e.getMessage());
      
    }
   


    }



}
