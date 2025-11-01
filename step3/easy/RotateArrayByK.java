// https://leetcode.com/problems/rotate-array/description/

/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */

package step3.easy;

import java.util.Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        int k = 6;
        System.out.println("Array before rotation: " + Arrays.toString(nums));
        leftRotateArray(nums, k);
        System.out.println("Array after rotation: " + Arrays.toString(nums));
    }

    //https://takeuforward.org/plus/dsa/problems/left-rotate-array
    public static void leftRotateArray (int[] nums, int k) {
        if (k == 0 || k == nums.length) return;

        k = k % nums.length;
        int[] sideArr = new int[k];

        for (int i = 0; i < k; i++) {
            sideArr[i] = nums[i];
        }

        for (int i = k; i < nums.length; i++) {
            nums[i - k] = nums[i];
        }

        for (int i = 0; i < k; i++) {
            nums[nums.length - k + i] = sideArr[i];
        }
    }
}
