// https://leetcode.com/problems/move-zeroes/description/

/*
Given an integer array nums, move all 0's to the
end of it while maintaining the relative order of
the non-zero elements. Note that you must do this
in-place without making a copy of the array.
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:
Input: nums = [0]
Output: [0]
 */

package step3.easy;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 4, 0, 5, 2 };

        System.out.println("Array before moving zeroes: " + Arrays.toString(nums));
        moveZeroes(nums);
        System.out.println("\nArray after moving zeroes: " + Arrays.toString(nums));

    }

    public static void moveZeroes (int[] nums) {
        for (int lastNonZeroFoundAt = 0, cur = 0; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                swap(nums, lastNonZeroFoundAt++, cur);
            }
        }
    }

    public static void swap (int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
