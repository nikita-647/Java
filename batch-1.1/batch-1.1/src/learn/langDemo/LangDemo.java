package learn.langDemo;

class MyObject {
  public String toString() {
    return "MY OBJECT";
  }

  public int hashCode() {
    return 1000;
  }

  public boolean equals(Object o) {
    return this.hashCode() == o.hashCode();
  }
}

class MyObject2 extends MyObject {
}

public class LangDemo {
  public static void main(String[] args) {
    // Object o1 = new Object();
    // Object o2 = new Object();
    // Object o2 = o1;
    // System.out.println(o1);
    // System.out.println(o1.equals(o2));
    // System.out.println(o1.hashCode());
    // System.out.println(o2.hashCode());

    MyObject mo1 = new MyObject();
    MyObject mo2 = new MyObject();
    System.out.println(mo1);
    System.out.println(mo1.hashCode());

    System.out.println(mo1.equals(mo2));
  }
}
