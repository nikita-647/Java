package learn.genericDemo;

public class First<T> {

  @SuppressWarnings("unchecked")
  T data[] = (T[]) new Object[3];

  public static void main(String[] args) {

    First<String> ft = new First<>();
    ft.data[0] = "hi";
    ft.data[1] = "bye";
    ft.data[2] = "10a";

    // *1
    // Object obj = new String("Hello World");
    // System.out.println(obj);
    // // obj = new Integer(10);

    // String str = (String) obj;

    // System.out.println(obj);
    // System.out.println(str);

    // *2
    // Object obj1[] = new Object[3];
    // obj1[0] = "hi";
    // obj1[1] = "bye";
    // obj1[2] = new Integer(10);

    // String str2;

    // for (int i = 0; i < 3; i++) {
    // str2 = (String) obj1[i];
    // System.out.println(str2);
    // }

  }
}
