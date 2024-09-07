package learn.genericDemo;

//* no parameters
//* multiple parameters

class MyArrayNew<T extends Number> {
  @SuppressWarnings("unchecked")
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

@SuppressWarnings("hiding")
class MyArray2<A> extends MyArrayNew<Short> {

}

public class GenericMore {
  @SuppressWarnings({ "unused", "unchecked", "rawtypes" })
  public static void main(String[] args) {
    MyArrayNew<Float> myArr = new MyArrayNew();

    // myArr.append("Hello");
    // myArr.append("Byee");
    // myArr.append(new Integer(10));
  }
}
