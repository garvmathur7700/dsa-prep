// https://leetcode.com/problems/sort-colors/description/

package step3.medium;

import step2.sorting2.QuickSort;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        System.out.println("Array before sorting: " + Arrays.toString(nums));
        sortColors(nums);
        System.out.println("Array after sorting: " + Arrays.toString(nums));
    }

    public static void sortColors (int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap (nums, mid, low);
                low++;
                mid++;
            }
            else if (nums[mid] == 1) mid++;
            else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void swap (int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
