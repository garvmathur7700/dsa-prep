// https://takeuforward.org/plus/dsa/problems/insertion-sorting

/*
Given an array of integers called nums, sort the array in
non-decreasing order using the insertion sort algorithm
and return the sorted array.
A sorted array in non-decreasing order is an array where
each element is greater than or equal to all preceding elements in the array.
Examples:
Input: nums = [7, 4, 1, 5, 3]
Output: [1, 3, 4, 5, 7]
Explanation: 1 <= 3 <= 4 <= 5 <= 7.
Thus, the array is sorted in non-decreasing order.
Input: nums = [5, 4, 4, 1, 1]
Output: [1, 1, 4, 4, 5]
Explanation: 1 <= 1 <= 4 <= 4 <= 5.
Thus, the array is sorted in non-decreasing order.
 */

package step2.sorting1;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = { 7, 4, 1, 5, 3 };
        insertionSort(nums);
    }

    public static void insertionSort(int[] nums) {
        System.out.println("\nArray before Insertion Sort:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i = 1; i < nums.length; i++) {
            int j = i - 1;
            int x  = nums[i];
            while (j > -1 && x < nums[j]) {
                nums[j + 1] = nums[j];
                nums[j] = x;
                j--;
            }
        }

        System.out.println("\nArray after Insertion Sort:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
