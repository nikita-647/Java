package learn.genericDemo;

class Data<T> {
  private T value;

  public void setValue(T v) {
    value = v;
  }

  public T getValue() {
    return value;
  }
}

class MyArray<T> {
  T A[] = (T[]) new Object[10];
  int length = 0;

  public void append(T v) {
    A[length] = v;
    length++;
  }

  public void display() {
    for (T val : A) {
      System.out.println(val);
    }
  }
}

public class GenericClass {
  public static void main(String[] args) {
    Data<Integer> d = new Data();
    d.setValue(100);
    System.out.println(d.getValue());

    MyArray<Boolean> arr = new MyArray();
    arr.append(true);
    arr.append(true);
    arr.append(false);
    arr.append(true);

    arr.display();
  }
}
