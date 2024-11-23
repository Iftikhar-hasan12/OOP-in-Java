/*Create an interface named as “Container” which contains the signature of two
methods one is public int add() which calculates the summation of two numbers and another
one is public void findMax(). Now create another class named as DataFrame which will implement the 
two methods of Container interface. Now create another Test class with the main method
to check your designed class and interface with various data.*/

package lolita;


interface Container {
    public int add();
    void findMax();
    
}


class DataFrame implements Container {
    int a, b;
    DataFrame(int a, int b){
        
        this.a=a;
        this.b=b;
    }
  
    @Override
    public int add(){
        return a+b;
    }
    @Override
  public  void findMax(){
        System.out.println("Max : "+((a>b)?a:b));
    }
    
}

public class Lolita {

   
    public static void main(String[] args) {
       DataFrame a = new DataFrame(10,20);
       a.findMax();
        System.out.println("Sum : "+a.add());
        
    }
    
}
