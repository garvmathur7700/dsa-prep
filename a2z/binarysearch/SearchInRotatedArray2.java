package binarysearch;

public class SearchInRotatedArray2 {
  public static void main(String[] args) {
    int[] nums = { 1, 3 };
    int target = 1;

    System.out.println(search(nums, target));
  }

  public static boolean search(int[] nums, int target) {
    int pivot = findPivot(nums);
    return binarySearch(nums, target, 0, pivot) ||
        binarySearch(nums, target, pivot + 1, nums.length - 1);
  }

  private static int findPivot(int[] nums) {
    int low = 0;
    int high = nums.length - 1;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (mid < high && nums[mid] > nums[mid + 1])
        return mid;

      if (mid > low && nums[mid] < nums[mid - 1])
        return mid - 1;

      if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
        if (low < high && nums[low] > nums[low + 1])
          return low;

        low++;

        if (high > low && nums[high] < nums[high - 1])
          return high - 1;

        high--;
      }

      else if (nums[low] < nums[mid] || (nums[low] == nums[mid] && nums[mid] > nums[high]))
        low = mid + 1;

      else
        high = mid - 1;
    }

    return -1;
  }

  private static boolean binarySearch(int[] nums, int target, int start, int end) {
    int low = start;
    int high = end;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (nums[mid] == target)
        return true;
      else if (target < nums[mid])
        high = mid - 1;
      else
        low = mid + 1;
    }

    return false;
  }
}
