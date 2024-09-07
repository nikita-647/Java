package learn.exceptionHandling;

import java.util.Scanner;

public class ExceptionDemo {
  public static void main(String[] args) {

    int a, b, c;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers");
    a = sc.nextInt();
    b = sc.nextInt();

    try {
      c = a / b;
      System.out.println(c);
    } catch (ArithmeticException e) {
      System.out.println("Division by Zero " + e);
    }

    System.out.println("bye");
  }

}
