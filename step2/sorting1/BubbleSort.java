// https://takeuforward.org/plus/dsa/problems/bubble-sort

/*
Given an array of integers called nums,sort the array
in non-decreasing order using the bubble sort algorithm
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

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 5, 4};
        bubbleSort(nums);
    }

    public static void bubbleSort(int[] nums) {
        System.out.println("Array before Bubble Sort: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int flag = 0;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) break;
        }

        System.out.println("\nArray after Bubble Sort: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
