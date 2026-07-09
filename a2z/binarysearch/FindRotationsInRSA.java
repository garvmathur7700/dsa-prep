package binarysearch;

public class FindRotationsInRSA {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2, 3 };

        System.out.println("Number of rotations: " + findKRotations(nums));
    }

    public static int findKRotations (int[] nums) {
        if (nums[0] <= nums[nums.length - 1])
            return 0;

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid < right && nums[mid] > nums[mid + 1])
                return mid + 1;
            if (mid > left && nums[mid] < nums[mid - 1])
                return mid;
            if (nums[left] < nums[mid])
                left = mid + 1;
            else
                right = mid -1;
        }

        return 0;
    }
}
