/*
Write a Java program to create a class called "Person" with a name and age attribute. 
Create two instances of the "Person" class, 
set their attributes using the constructor, and print their name and age.
*/


package com.mycompany.mid;

class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;

    }
    void tv()
    {
        System.out.println("Name : "+name+ "\nAge : "+age);
    }

}

public class Mid {

    public static void main(String[] args) {
        Person p = new Person("Atif",20);
        p.tv();
    }
}
