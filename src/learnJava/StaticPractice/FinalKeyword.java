package learnJava.StaticPractice;

// final variables
// final methods
// final class

class My{
    final int MIN = 1; // cannot be update
    final int NORMAL;
    
    // static block
    final int MAX;
    {
        NORMAL = 5;
    }
    
    //  constructor runs on creation of object;
    My(){
          MAX = 10;
    }
     
    final public void meth1(){
        System.out.println("this is final meth1 of class My");
    }
    public void meth2(){
        System.out.println("This is normalmethod 2 of class My");
    }


}

class You extends My {
    @Override
    public void meth2(){
        System.out.println("normal meth2 of class You");
    }
}
    // @Override
    // final public void meth1(){}

    final class Parent{
        public void meth100(){

        }
    }
    // class Child extends Parent{}

public class FinalKeyword {
    public static void main(String[] args) {
       My m = new My();
       System.out.println(m.MIN);
       
       System.out.println(m.NORMAL);
       System.out.println(m.MAX);

       Parent p = new Parent();
       p.meth100();
    }
}
