/*
 Write a Java program to create an interface Flyable with a method called fly_obj(). 
 Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface.
 Implement the fly_obj() method for each of the three classes.
*/

package flag;
interface Flyable {
    void fly_obj();
}


class Spacecraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("SpaceCraft are flying !!");
    }
}

class Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Airplane  are flying !!");
    }
}

class Helicopter  implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Helicopter  are flying !!");
    }
}
public class Flag {

    public static void main(String[] args) {

      Flyable a = new Spacecraft();
      Flyable b = new Airplane();
      Flyable c = new Helicopter();
      a.fly_obj();
      b.fly_obj();
      c.fly_obj();
       
    }
}
