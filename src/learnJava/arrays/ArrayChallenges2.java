package learnJava.arrays;

public class ArrayChallenges2 {
  public static void main(String[] args) {

    int[] A = { 5, 9, 6, 10, 12, 7, 3, 5, 4, 2 };

    // * 1. Rotating an array

    int temp = A[0];
    for (int i = 1; i < A.length; i++) {
      A[i - 1] = A[i];
    }
    A[A.length - 1] = temp;

    for (int i : A) {
      // System.out.print(i + " ");
    }
    System.out.println();

    // * 2. Insert an element

    int B[] = new int[10];
    B[0] = 5;
    B[1] = 9;
    B[2] = 6;
    B[3] = 10;
    B[4] = 12;
    B[5] = 7;

    // [5, 9, 6, 10, 12, 7, 0, 0, 0, 0]
    // n=15, index=2
    // [5, 9, 15, 6, 10, 12, 7, 0, 0, 0]

    int n = 6;
    for (int i = 0; i < n; i++)
      System.out.print(B[i] + " ");

    System.out.println();
    int x = 15;
    int index = 2;

    for (int i = n; i > index; i--)
      B[i] = B[i - 1];

    B[index] = x;

    for (int i = 0; i < n + 1; i++)
      System.out.print(B[i] + " ");

    // * 3. Delete an element

    // [5, 9, 6, 10, 12, 7, 0, 0, 0, 0]
    // index=3
    // [5, 9, 6, 12, 7, 0, 0, 0, 0, 0]

    int C[] = new int[10];
    C[0] = 5;
    C[1] = 9;
    C[2] = 6;
    C[3] = 10;
    C[4] = 12;
    C[5] = 7;

  }
}
