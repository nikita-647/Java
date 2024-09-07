package learnJava.interfaces;

interface Test1 {
  void meth1();

  void meth2();
}

class Test2 implements Test1 {
  public void meth1() {
    System.out.println("Meth 1");
  }

  public void meth2() {
    System.out.println("Meth 2");
  }

  public void meth3() {
    System.out.println("Meth 3");
  }
}

public class Intro {
  public static void main(String[] args) {
    Test1 t = new Test2();
    t.meth2();
  }

}
