// https://takeuforward.org/plus/dsa/problems/recursive-insertion-sort

package step2.sorting2;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] nums = { 7, 4, 1, 5, 3 };
        System.out.println("Array before Insertion Sort:");
        for (int num :  nums) {
            System.out.print(num + " ");
        }

        recursiveInsertionSort(nums, 1);

        System.out.println("\nArray after Insertion Sort:");
        for (int num :  nums) {
            System.out.print(num + " ");
        }
    }

    public static void recursiveInsertionSort(int[] nums, int n) {
        if (n > nums.length - 1) return;

        int j = n - 1;
        int x  = nums[n];
        while (j > -1 && x < nums[j]) {
            nums[j + 1] = nums[j];
            nums[j] = x;
            j--;
        }

        recursiveInsertionSort(nums, n + 1);
    }
}
