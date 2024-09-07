package learnJava.methods;

public class MethodsChallenge {

  static boolean isPrime(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  static int getHCF(int m, int n) {
    while (m != n) {
      if (m > n)
        m = m - n;
      else
        n = n - m;
    }
    return m;
  }

  static int getMax(int[] A) {
    int max = A[0];
    for (int i = 0; i < A.length; i++) {
      if (A[i] > max) {
        max = A[i];
      }
    }
    return max;
  }

  public static void main(String[] args) {
    // 1. Find a Number is Prime or not
    System.out.println(isPrime(20));
    // 2. Find HCF of 2 numbers
    System.out.println(getHCF(25, 15));
    // 3. Find max el in an array
    int[] A = { 4, 1, 16, 23, 14, 25, 32 };
    System.out.println(getMax(A));
    System.out.println(getMax(new int[] { 2, 4, 10, 16, 12, 7 }));
  }
}