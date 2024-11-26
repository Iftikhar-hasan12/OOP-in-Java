/*Create a class called EmployeeAvailability with a method checkAvailability(int age) that
receives the age of an employee. Implement this method to throw a custom exception named
UnavailableForProjectException if the age is not within the acceptable range for specific project roles. 
b) The main class should capture the UnavailableForProjectException and display the appropriate message. 
c) For instance, consider a project that requires team members aged 25 to 40 for specific responsibilities. 
Test cases should include:
● An employee aged 28, considered eligible.
● An employee aged 19, triggering the UnavailableForProjectException. 
● An employee aged 45, also triggering the exception.*/

package lolita;


class UnavailableForProjectException extends Exception{
   
    UnavailableForProjectException(String s){
        super(s);
    }
    
}


class EmployeeAvailability {
    
    
    void checkAvailability(int age)throws UnavailableForProjectException{
        
        if(!(age >=  25 && age <= 40)){
            throw new UnavailableForProjectException("Boyosh match hoy na");
            
        }else{
            System.out.println("Approved ");
        }
    }
    
}





public class Lolita {

   
    public static void main(String[] args) {
      
        
        try{
            EmployeeAvailability em = new EmployeeAvailability();
            em.checkAvailability(45);
        }catch( UnavailableForProjectException e){
            System.out.println("Error Caught : "+e.getMessage());
        }
        
    }
    
}
