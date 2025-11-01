// https://takeuforward.org/plus/dsa/problems/selection-sort

/*
Given an array of integers nums, sort the array
in non-decreasing order using the selection sort
algorithm and return the sorted array.
A sorted array in non-decreasing order
is an array where each element is greater than or
equal to all previous elements in the array.
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

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {7, 4, 1 ,5, 3};
        selectionSort(nums);
    }

    public static void selectionSort(int[] nums) {
        System.out.println("\nArray before Selection Sort:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < nums.length; i++) {
            int mini = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[mini]) {
                    mini = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[mini];
            nums[mini] = temp;
        }

        System.out.println("\nArray after Selection Sort: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}