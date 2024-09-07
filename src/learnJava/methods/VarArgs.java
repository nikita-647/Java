package learnJava.methods;

public class VarArgs {
  static void show(int... x) {
    for (int i : x) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    show();
    show(10);
    show(10, 20);
    show(10, 20, 30);
    show(10, 20, 30, 50, 100, 150, 1000);
  }
}
