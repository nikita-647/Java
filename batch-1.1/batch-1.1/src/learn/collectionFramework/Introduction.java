package learn.collectionFramework;

public class Introduction {
  public static void main(String[] args) {
    int A[] = { 2, 4, 10, 12, 16 };

    int B[] = new int[10];
    for (int index = 0; index < A.length; index++) {
      // System.out.print(A[index] + " ");
      B[index] = A[index];
    }

    A = B;
    B = null;

    for (int index = 0; index < A.length; index++) {
      System.out.print(A[index] + " ");
    }
  }
}
