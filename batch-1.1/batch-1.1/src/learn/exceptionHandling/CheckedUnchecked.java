package learn.exceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;

class LowBalanceException extends Exception {
  public String toString() {
    return "Balance should not be less than 2000";
  }
}

public class CheckedUnchecked {
  static void fun1() {

    try {
      throw new LowBalanceException();
    } catch (LowBalanceException e) {
      System.out.println(e);
    }

    // try {
    // FileInputStream fi = new FileInputStream("my.txt");
    // } catch (IOException e) {
    // System.out.println("File Not Found");
    // }

    // try {
    // System.out.println(10 / 0);
    // } catch (ArithmeticException e) {
    // System.out.println(e.getMessage());
    // System.out.println(e);
    // e.printStackTrace();
    // System.out.println("/ by zero");
    // }
  }

  static void fun2() {
    fun1();
  }

  static void fun3() {
    fun2();
  }

  public static void main(String[] args) {
    fun3();
  }
}
