package learnJava.methods;

public class VarArgsCh {
  static int max(int... A) {

    if (A.length == 0)
      return Integer.MIN_VALUE;

    int max = A[0];
    for (int i : A) {
      if (i > max)
        max = i;
    }
    return max;
  }

  static int sum(int... A) {
    int sum = 0;
    for (int i : A) {
      sum += i;
    }
    return sum;
  }

  static double discount(int... P) {
    int priceSum = sum(P);
    if (priceSum <= 500)
      return priceSum * 0.1;
    if (priceSum > 500 && priceSum <= 1000)
      return priceSum * 0.15;
    else
      return priceSum * 0.2;
  }

  public static void main(String[] args) {
    // 1. Maximum of numbers using varargs
    // System.out.println(max());
    // 2. Sum of all elements using varargs
    // System.out.println(max(10, 20, 100, 50));
    // System.out.println(sum(10, 20, 100, 50));
    // 3. Calculate Discount using varargs
    System.out.println(discount(100, 200, 100, 300, 1000));
  }
}
