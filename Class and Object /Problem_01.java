
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
