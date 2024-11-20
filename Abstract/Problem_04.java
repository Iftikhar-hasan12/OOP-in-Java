/*Write a Java program to create an abstractclass Employee with abstract methods 
calculateSalary()and displayInfo(). Create subclasses Manager and Programmer that extend the Employee
class and implement the respective methods to 
calculate salary and display information for each role*/


package com.mycompany.mid;

abstract class employee{
    abstract double calculateSalary();
    abstract void display();
    double salary;
    employee(double salary)
    {
        this.salary = salary;
        
    }
    
}

class Manager extends employee{
    
    @Override
    public double calculateSalary()
    {
        
    }
    
    @Override
    public void display()
    {
    
    }
  
}

class Programmer extends employee{
     @Override
    public double calculateSalary()
    {
        
    }
    
    @Override
    public void display()
    {
    
    }
  
}


public class Mid {

    public static void main(String[] args) {

 
        
    }
}
