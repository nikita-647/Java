package learnJava.arrays;

public class ArrayChallenges3 {
  public static void main(String[] args) {
    // * 1. Copying an array
    int[] A = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
    int[] B = new int[A.length];

    // for (int i = 0; i < A.length; i++) {
    // B[i] = A[i];
    // }

    // for (int i : B) {
    // System.out.print(i + " ");
    // }

    // * 2. Reverse Copying an array
    // for (int i = A.length - 1, j = 0; i >= 0; i--, j++) {
    // B[j] = A[i];
    // }

    // for (int i : B) {
    // System.out.print(i + " ");
    // }

    // * 3. Increase size of an array
    int[] C = { 8, 6, 10, 9, 2 };

    int[] D = new int[C.length * 2];

    for (int i = 0; i < C.length; i++) {
      D[i] = C[i];
    }

    C = D;
    D = null;

    System.out.println(C.length);
  }
}
