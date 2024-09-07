package learn.DSA;

public class TwoSum {
  public static void main(String[] args) {
    int[] A = { 2, 7, 11, 15 };
    int S[] = twoSum(A, 18);
    System.out.println(S[0]);
    System.out.println(S[1]);
  }

  static public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] { i, j };
        }
      }
    }
    return new int[] {};
  }

}
