package learn.genericDemo;

class A {
  public String toString() {
    return "object of class A";
  }
}

class B extends A {
  public String toString() {
    return "object of class B";
  }
}

class C extends A {
  public String toString() {
    return "object of class C";
  }
}

class DemoGeneric<T extends A> {

  T A[] = (T[]) new Object[10];
  int length = 0;

  public void append(T v) {
    A[length++] = v;
  }

  public void display() {
    for (int i = 0; i < A.length; i++) {
      System.out.println(A[i]);
    }
  }
}

public class GenericThree {
  public static void main(String[] args) {
    // DemoGeneric<A> d = new DemoGeneric<>();

    Object obj = new Object();

    obj = new String("Hello");
    String str = (String) obj;

    System.out.println(obj);
  }
}
