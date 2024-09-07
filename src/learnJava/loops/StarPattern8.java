package learnJava.loops;

import java.util.Scanner;

public class StarPattern8 {
  public static void main(String[] args) {

    int st = 3, sp = 1;

    for (int i = 1; i <= 5; i++) {
      // System.out.println("st:" + st + " sp:" + sp + " st:" + st);
      for (int j = 1; j <= st; j++) {
        System.out.print("* ");
      }

      for (int j = 1; j <= sp; j++) {
        System.out.print("  ");
      }

      for (int j = 1; j <= st; j++) {
        System.out.print("* ");
      }
      System.out.println();

      if (i < 3) {
        st--;
        sp = sp + 2;
      } else {
        st++;
        sp = sp - 2;
      }
    }

  }
}
