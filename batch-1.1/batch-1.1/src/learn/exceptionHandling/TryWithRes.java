package learn.exceptionHandling;

import java.util.Scanner;

public class TryWithRes {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter a number");
      int x = sc.nextInt();
      System.out.println(x);
    }

  }
}
