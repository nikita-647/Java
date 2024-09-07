package learnJava.abstractClasses;

abstract class Parent {
  public Parent() {
    System.out.println("Parent Constructor");
  }

  public void meth1() {
    System.out.println("Meth1 of Parent");
  }

  abstract public void meth2();
}

class Child extends Parent {
  public void meth2() {
    System.out.println("Meth2 of Child");
  }
}

public class AbstractExample {
  public static void main(String[] args) {
    Parent p;
    // Parent p1= new Parent();

    Parent p2 = new Child();
    p2.meth1();
    p2.meth2();
  }
}
