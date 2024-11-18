/*Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). 
Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName()
method to include the employee's job title.*/
package com.mycompany.mid;
class Person {

  private String first_name,last_name;

   Person(String first_name, String last_name)
   {
       this.first_name = first_name;
       this.last_name = last_name;
       
   }

    String getFirstName() {
        return first_name;
    }
    
    
    String getlast_name(){
        
        return last_name;
        
    }
    

}

class Employee extends Person{
private int id;
private String  title;
 

Employee(String first_name, String last_name, int id,String title)
{
    super(first_name, last_name);
    this.id =id;
    this.title = title;
    
}


    int getEmployeedId() {
        return id;
    }

    @Override
    String getlast_name() {
        return super.getlast_name()+" "+title;
        
    }

}

public class Mid {

    public static void main(String[] args) {

Employee e = new Employee("Iftikhar", " Hasan ",223,"Capt");     
        System.out.print(e.getFirstName() + " "+e.getlast_name()+ "  ID :"+e.getEmployeedId()); 
    }
}
