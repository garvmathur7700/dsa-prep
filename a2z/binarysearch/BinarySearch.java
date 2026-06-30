package binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 5, 7, 9, 11, 13, 17 };
        int target = 14;

        System.out.println("Does " + target + " exist in array? " + binarySearch(nums, target));
    }

    public static int binarySearch (int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
}
