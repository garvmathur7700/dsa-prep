package binarysearch.arrays1d;

import java.util.Arrays;

public class FloorAndCeil {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 8, 10 };
        int x = 1;

        System.out.println(Arrays.toString(floorAndCeil(nums, x)));
    }

    public static int[] floorAndCeil (int[] nums, int x) {
        int low = 0, high = nums.length - 1;
        int floorIdx = -1;
        int ceilIdx = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (x == nums[mid]) {
                return new int[] { nums[mid], nums[mid] };
            } else if (x > nums[mid]) {
                floorIdx = mid;
                low = mid + 1;
            } else {
                ceilIdx = mid;
                high = mid - 1;
            }
        }

        int floorVal = floorIdx == -1 ? -1 : nums[floorIdx];
        int ceilVal = ceilIdx == -1 ? -1 : nums[ceilIdx];

        return new int[] {floorVal, ceilVal};
    }
}
