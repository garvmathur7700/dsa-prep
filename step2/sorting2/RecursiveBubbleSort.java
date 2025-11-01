// https://takeuforward.org/plus/dsa/problems/recursive-bubble-sort

package step2.sorting2;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] nums = { 7, 4, 1, 5, 3 };
        int n = nums.length;

        System.out.println("Array before Bubble Sort:");
        for (int num :  nums) {
            System.out.print(num + " ");
        }

        recursiveBubbleSort(nums, n);

        System.out.println("\nArray after Bubble Sort:");
        for (int num :  nums) {
            System.out.print(num + " ");
        }
    }

    // [ 7, 4, 1, 5, 3 ]
    // [ 4, 1, 5, 3, 7 ]
    // [ 1, 4, 3, 5, 7 ]
    // [ 1, 3, 4, 5, 7 ]
    public static void recursiveBubbleSort(int[] nums, int n) {
        if (n == 1) return;

        for (int j = 0; j < n - 1; j++) {
            if (nums[j] > nums[j + 1]) {
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
            }
        }

        recursiveBubbleSort(nums, n - 1);
    }
}