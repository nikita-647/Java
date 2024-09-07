package learn.exceptionHandling;

public class NestedCatch {
  public static void main(String[] args) {
    int[] A = { 30, 20, 10, 40, 0 };

    // multiple try catch
    // try {
    // int c = A[0] / A[3];
    // System.out.println("Division is " + c);
    // System.out.println(A[10]);
    // } catch (ArithmeticException e) {
    // System.out.println("Denominator should not zero");
    // } catch (ArrayIndexOutOfBoundsException e) {
    // System.out.println("Index is invalid");
    // }

    try {
      int c = A[0] / A[3];
      System.out.println("Division is " + c);

      try {
        System.out.println(A[10]);
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e.getMessage());
        System.out.println(e.getMessage());
        System.out.println("Index is invalid");
      }

    } catch (ArithmeticException e) {
      System.out.println("Denominator should not zero");
    }

    System.out.println("Bye");
  }
}
