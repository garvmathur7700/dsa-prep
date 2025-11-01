// https://leetcode.com/problems/next-permutation/description/

package step3.medium;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1,3,2};
        nextPermutation(nums);
    }

    public static void nextPermutation(int[] nums) {
        int index = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            reverseArray(nums, 0, nums.length);
            System.out.println(Arrays.toString(nums));
            return;
        }

        for (int i = nums.length - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }

        reverseArray(nums, index + 1, nums.length);

        System.out.println(Arrays.toString(nums));
    }

    private static void reverseArray (int[] nums, int startIndex, int endIndex) {
        for (int i = startIndex, j = endIndex - 1; i < (startIndex + endIndex) / 2; i++, j--) {
            swap(nums, i, j);
        }
    }

    private static void swap (int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
