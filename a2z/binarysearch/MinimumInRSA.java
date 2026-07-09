package binarysearch;

public class MinimumInRSA {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 1, 2 };

        System.out.println("Minimum in rotated sorted array: " + findMin(nums));
    }

    public static int findMin (int[] nums) {
        if (nums.length == 1)
            return nums[0];

        if (nums[0] < nums[nums.length - 1])
            return nums[0];

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid < right && nums[mid] > nums[mid + 1])
                return nums[mid + 1];
            if (mid > left && nums[mid] < nums[mid - 1])
                return nums[mid];
            if (nums[left] < nums[mid])
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }
}
