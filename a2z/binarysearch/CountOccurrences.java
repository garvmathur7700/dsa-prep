package binarysearch;

public class CountOccurrences {
  public static void main(String[] args) {
    int[] nums = { 0, 0, 1, 1, 1, 2, 3 };
    int target = 4;

    System.out.println("Total Occurrences of " + target + ": " + countOccurrences(nums, target));
  }

  public static int countOccurrences(int[] nums, int target) {
    int start = binarySearch(nums, target, true);
    int end = binarySearch(nums, target, false);

    if (start == -1)
      return 0;

    return end - start + 1;
  }

  public static int binarySearch(int[] nums, int target, boolean searchLeft) {
    int low = 0, high = nums.length - 1;
    int ans = -1;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (target == nums[mid]) {
        ans = mid;

        if (searchLeft)
          high = mid - 1;
        else
          low = mid + 1;
      } else if (target < nums[mid])
        high = mid - 1;
      else
        low = mid + 1;
    }

    return ans;
  }
}
