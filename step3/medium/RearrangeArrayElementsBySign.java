// https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

package step3.medium;

import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] nums = { 3,1,-2,-5,2,-4 };
        System.out.println("Original Array: " + Arrays.toString(nums));
        System.out.println("Rearranged Array: " + Arrays.toString(rearrangedArray(nums)));
    }

    public static int[] rearrangedArray (int[] nums) {
        int[] rearrangedArray = new int[nums.length];

        int ptr = 0;
        int posPtr = 0;
        int negPtr = 1;
        while (ptr < nums.length) {
            if (nums[ptr] >= 0 && posPtr < nums.length - 1) {
                rearrangedArray[posPtr] = nums[ptr];
                posPtr += 2;
            } else if (nums[ptr] < 0 && negPtr < nums.length) {
                rearrangedArray[negPtr] = nums[ptr];
                negPtr += 2;
            }
            ptr++;
        }

        return rearrangedArray;
    }
}
