package learnJava.arrays;

import java.util.Scanner;

public class ArrayChallenges1 {
  public static void main(String[] args) {

    int A[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };

    /*
     * 
     * //* 1. Finding Sum of all elements
     * 
     * int sum = 0;
     * // for (int i = 0; i <= A.length - 1; i++) {
     * // sum = sum+A[i];
     * // }
     * 
     * for (int num : A) {
     * sum = sum + num;
     * }
     * System.out.println(sum);
     * 
     * // * 2. Searching an element
     * Scanner sc = new Scanner(System.in);
     * System.out.println("Enter a number to find:");
     * int n = sc.nextInt();
     * 
     * for (int i = 0; i <= A.length - 1; i++) {
     * if (A[i] == n) {
     * System.out.println(i);
     * System.exit(0);
     * }
     * }
     * System.out.println("Not found");
     * 
     * // 3. Finding largest element
     * int max = A[0]; // 3
     * for (int i = 0; i <= A.length - 1; i++) {
     * if (A[i] > max) {
     * max = A[i];
     * }
     * }
     * System.out.println(max);
     */

    // 4. Finding second largest element
    int max1 = A[0], max2 = A[0];
    for (int i = 0; i <= A.length - 1; i++) {
      if (A[i] > max1) {
        max2 = max1;
        max1 = A[i];
      } else if (A[i] > max2) {
        max2 = A[i];
      }
    }

    System.out.println(max1);
    System.out.println(max2);
  }
}
