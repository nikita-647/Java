package learnJava.loops;

import java.util.Scanner;

public class StarPattern7 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    int sp = n / 2, st = 1;

    for (int i = 1; i <= n; i++) {
      // space
      for (int j = 1; j <= sp; j++) {
        System.out.print("  ");
      }
      // star
      for (int j = 1; j <= st; j++) {
        System.out.print("* ");
      }

      if (i < n / 2 + 1) {
        sp--;
        st = st + 2;
      } else {
        sp++;
        st = st - 2;
      }
      System.out.println();
    }

  }
}
