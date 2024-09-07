package learnJava.loops;

public class StarPattern6 {
  public static void main(String[] args) {

    int sp = 4, st = 1;

    for (int i = 1; i <= 5; i++) {
      // space
      for (int j = 1; j <= sp; j++) {
        System.out.print("  ");
      }
      // star
      for (int j = 1; j <= st; j++) {
        System.out.print("* ");
      }
      sp--;
      st++;
      System.out.println();
    }

    // for (int i = 0; i < 5; i++) {
    // for (int j = 5; j > i + 1; j--) {
    // System.out.print(" ");
    // }
    // for (int k = 0; k <= i; k++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
  }
}
