package binarysearch.arrays1d;

import java.util.Arrays;

public class LowerBound {
    public static void main(String[] args) {
        int[] nums = { -5, -3, -1, -1, 0 };
        int x = -2;

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Target: " + x);
        System.out.println("Lower Bound Index: " + lowerBound(nums, x));
        try {
            System.out.println("Lower Bound Value: " + nums[lowerBound(nums, x)]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("Element not found!");
        }
    }

    public static int lowerBound (int[] nums, int x) {
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }

        return ans;
    }
}
