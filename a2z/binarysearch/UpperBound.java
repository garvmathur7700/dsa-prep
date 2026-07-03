package binarysearch;

import java.util.Arrays;

public class UpperBound {
    public static void main(String[] args) {
        int[] nums = { -10, -9, -7, -6, -5 };
        int x = -4;

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Target: " + x);
        System.out.println("Upper Bound Index: " + upperBound(nums, x));
        try {
            System.out.println("Upper Bound Value: " + nums[upperBound(nums, x)]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("Element not found!");
        }
    }

    public static int upperBound (int[] nums, int x) {
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }

        return ans;
    }
}
