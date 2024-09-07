package learnJava.methods;

public class MethodOverloadingCh {
  static int area(int l, int b) {
    return l * b;
  }

  static double area(int r) {
    return Math.PI * r * r;
  }

  static double area(int a, int b, int h) {
    return 0.5f * (a + b) * h;
  }

  public static void main(String[] args) {

    // 1. overloading method to calculate areas
    System.out.println(area(10, 20, 5));

    // 2. overloading method to reverse a int or array
    // 476 => 674
    // [20, 30, 40] => [40, 30, 20]
  }
}
