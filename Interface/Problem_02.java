/* Write a Java program to create an Animal interface with a method called bark() 
that takes no arguments and returns void. Create a Dog class that implements Animal and overrides speak() to print "Dog is barking".
*/
package flag;
interface Animal {
    void bark();
}
class Dog implements Animal {
    @Override
    public void bark() {
        System.out.println("Dog is barking!!");
    }
}
public class Flag {

    public static void main(String[] args) {

       Animal a = new Dog();
       a.bark();
    }
}
