package learnJava.abstractClasses;

abstract class Super {

  public void display() {
    System.out.println("Hello Super");
  }

  abstract public void meth1();
}

class Sub extends Super {

  public void meth1() {
    System.out.println("Meth 1 Sup");
  }
}

public class DosAndDonts {
  public static void main(String[] args) {
    Super s;

  }
}
