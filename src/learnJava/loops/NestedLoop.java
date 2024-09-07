package learnJava.loops;

public class NestedLoop {
  public static void main(String[] args) {
    
    /*
    for (int i = 1; i <= 5; i++) {
      System.out.println("i: " + i);
      for (int j = 1; j <= 5; j++) {
        System.out.println("j: " + j);
      }
    }
    
    for (int i = 1; i <= 5; i++) {
      System.out.println("i: " + i);
      for (int j = 1; j <= 5; j++) {
        System.out.print("j: " + j + " ");
      }
      System.out.println();
    }

    */

    for (int i = 1; i <= 5; i++) {
      
      for (int j = 1; j <= 5; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

  }
}
