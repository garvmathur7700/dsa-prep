package step3.hard;

public class MaximumProductSubarray {
  public static void main(String[] argv) {
    int[] nums = { 2, 3, -2, 4 };
    System.out.println("Maximum Product: " + maxProduct(nums));
  }

  public static int maxProduct(int[] nums) {
    int maxSoFar = nums[0];
    int minSoFar = nums[0];
    int result = nums[0];

    for (int i = 1; i < nums.length; i++) {
      int temp = Math.max(nums[i],
          Math.max(nums[i] * maxSoFar, nums[i] * minSoFar));

      minSoFar = Math.min(nums[i],
          Math.min(nums[i] * maxSoFar, nums[i] * minSoFar));

      maxSoFar = temp;

      result = Math.max(result, maxSoFar);
    }

    return result;
  }
}
