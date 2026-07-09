package binarysearch.arrays1d;

public class SearchInRotatedArray1 {
  public static void main(String[] args) {
    int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
    int target = 1;

    System.out.println("Target exists at index: " + search(nums, target));
  }

  public static int search(int[] nums, int target) {
    if (nums[0] > nums[nums.length - 1]) {
      int pivot = findPivot(nums);

      return Math.max(binarySearch(nums, target, 0, pivot - 1),
          binarySearch(nums, target, pivot, nums.length - 1));
    }

    return binarySearch(nums, target, 0, nums.length - 1);
  }

  private static int findPivot(int[] nums) {
    int low = 0, high = nums.length - 1;

    if (nums.length == 1)
      return 0;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (mid < high && nums[mid] > nums[mid + 1])
        return mid;
      if (mid > low && nums[mid] < nums[mid - 1])
        return mid - 1;
      if (nums[mid] <= nums[low])
        high = mid - 1;
      else
        low = mid + 1;
    }

    return -1;
  }

  private static int binarySearch(int[] nums, int target, int start, int end) {
    int low = start, high = end;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (nums[mid] == target)
        return mid;
      else if (target < nums[mid])
        high = mid - 1;
      else
        low = mid + 1;
    }

    return -1;
  }
}
