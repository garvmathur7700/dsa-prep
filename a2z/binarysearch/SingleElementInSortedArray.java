package binarysearch;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = { 1 };

        System.out.println("Single Number: " + singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // if mid - 1 and mid + 1 are out of bounds then there is only single element
            if ((mid - 1 < 0 || nums[mid - 1] != nums[mid]) &&
                (mid + 1 == nums.length || nums[mid] != nums[mid + 1]))
                return nums[mid];

            int leftSize = 0;
            if ((mid - 1 >= 0 && nums[mid - 1] == nums[mid]))
                leftSize = mid - 1;
            else if ((mid + 1 < nums.length && nums[mid] == nums[mid + 1]))
                leftSize = mid;

            if (leftSize % 2 == 1) // Odd
                right = mid - 1;
            else // even
                left = mid + 1;
        }

        return -1;
    }
}
