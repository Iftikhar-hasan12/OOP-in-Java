/*Write a Java program to create an abstract class Animal with abstract methods eat() and sleep().
Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() 
and sleep() methodsdifferently based on their specific behavior.*/


package com.mycompany.mid;
abstract class Animal {

    abstract void eat();

    abstract void sleep();

}

class Lion extends Animal {

    @Override
    public void eat() {
        System.out.println("Lion Eat Meat ");
    }

    @Override
    public void sleep() {
        System.out.println("Lion Sleep at night");
    }
}

class Tiger extends Animal {

    @Override
    public void eat() {
        System.out.println("Tiger Eat Meat ");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger Sleep at night");
    }
}

class Deer extends Animal {

    @Override
    public void eat() {
        System.out.println("Deer Eat Grasses ");
    }

    @Override
    public void sleep() {
        System.out.println("Deer does not Sleep at night");
    }
}

public class Mid {

    public static void main(String[] args) {

        Lion l = new Lion();
        Tiger t = new Tiger();
        Deer d = new Deer();
        l.eat();
        l.sleep();
        System.out.println("");
        t.eat();
        t.sleep();
        System.out.println("");

        d.eat();
        d.sleep();

    }
}
