package binarysearch.arrays1d;

import java.util.Arrays;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] nums = {0, 0};
        int target = 0;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = binarySearch(nums, target, true);
        int end = binarySearch(nums, target, false);

        return new int[]{start, end};
    }

    public static int binarySearch (int[] nums, int target, boolean searchLeft) {
        int low = 0, high = nums.length - 1;
        int res = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target == nums[mid]) {
                res = mid;

                if (searchLeft)
                    high = mid - 1;
                else
                    low = mid + 1;
            } else if (target < nums[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }

        return res;
    }
}
