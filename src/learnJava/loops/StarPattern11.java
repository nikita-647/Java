package learnJava.loops;

public class StarPattern11 {
  public static void main(String[] args) {

    int sp = 2;
    int st = 1;
    int count = 1;
    int countCopy;

    for (int i = 1; i <= 5; i++) {
      // space
      for (int j = 1; j <= sp; j++) {
        System.out.print("  ");
      }
      countCopy = count;

      // star
      for (int j = 1; j <= st; j++) {
        System.out.print(countCopy + " ");
        countCopy++;
      }
      if (i < 3) {
        count++;
        sp--;
        st = st + 2;
      } else {
        count--;
        sp++;
        st = st - 2;
      }
      countCopy = count;

      System.out.println();
    }

  }
}
