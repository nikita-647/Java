package learnJava.arrays;

public class TwoDimensionalArray {
  public static void main(String[] args) {
    int A[][] = new int[3][4];
    int B[][] = { { 1, 2, 3, 4 }, { 10, 20, 30, 40 }, { 100, 200, 300, 400 } };
    System.out.println(B[0][3]);
    int C[][];
    C = new int[5][5];
    int[] D[] = new int[2][3];

    int[] E, F[];
    int[] G, H, I, J[];

    for (int[] x : B) {
      for (int y : x) {
        System.out.print(y + " ");
      }
      System.out.println();
    }

    // for (int i = 0; i < B.length; i++) {
    // for (int k = 0; k < B[i].length; k++) {
    // System.out.print(B[i][k] + " ");
    // }
    // System.out.println();
    // }
  }
}
