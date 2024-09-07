package learnJava.arrays;

public class Intro {
  public static void main(String[] args) {
    /*
     * int A[] = new int[5];
     * System.out.println(A);
     * System.out.println(A.length);
     * System.out.println(A[1]);
     * 
     * int[] B = { 5, 10, 15, 20, 25 };
     * System.out.println(B);
     * System.out.println(B[2]);
     * 
     * //* names array => 5 random names
     * String[] names = new String[5];
     * namesNew[0] = "Rahul";
     * namesNew[1] = "Vishal";
     * System.out.println(namesNew[1]);
     */

    String[] namesNew = { "Chetan", "Rahul", "Pankaj", "Tarun" };
    System.out.println(namesNew.length);

    // * for loop
    // for (int i = 0; i <= namesNew.length - 1; i++) {
    // System.out.println(namesNew[i]);
    // }

    // * for_each loop
    for (String name : namesNew) {
      System.out.println(name);
    }

    int[] nums = { 5, 10, 15, 20, 25 };
    for (int num : nums) {
      System.out.println(num);
    }
  }
}
