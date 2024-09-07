package learn.genericDemo;

class DemoNew<T> {
  @SuppressWarnings("unchecked")
  T[] A = (T[]) new Object[10];
  int length = 0;

  public void append(T v) {
    A[length] = v;
    length++;
  }

  public void display() {
    for (T val : A) {
      System.out.print(val + " ");
    }
  }
}

public class GenericMethods {

  // static <E> void show(E... arr) {
  // for (E x : arr) {
  // System.out.println(x);
  // }
  // }

  static void meth1(DemoNew<? extends Number> obj) {
    obj.display();
  }

  public static void main(String[] args) {
    // show(10, 20, 30, 40, 50);
    // show("Hello", "Bye", "World");
    // DemoNew<String> d1 = new DemoNew<>();
    // d1.append("Hello");
    // d1.append("Bye");
    // d1.append("World");
    // meth1(d1);
    // System.out.println();

    DemoNew<Integer> d2 = new DemoNew<>();
    d2.append(10);
    d2.append(10);
    d2.append(10);
    meth1(d2);
  }
}
