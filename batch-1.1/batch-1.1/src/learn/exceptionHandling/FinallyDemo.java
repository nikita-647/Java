package learn.exceptionHandling;

public class FinallyDemo {
  static void meth1() throws Exception {
    try {
      throw new Exception();
    } finally {
      System.out.println("Final Message");
    }
  }

  public static void main(String[] args) {
    // try {
    // System.out.println(10 / 0);
    // } catch (ArithmeticException e) {
    // System.out.println(e);
    // } finally {
    // System.out.println("Final Message");
    // }
    try {
      meth1();
    } catch (Exception e) {
      System.out.println("My catch block in main method");
    }

  }
}
