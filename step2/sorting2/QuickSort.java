// https://takeuforward.org/plus/dsa/problems/quick-sorting

package step2.sorting2;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = { 10, 16, 8, 12, 15, 6, 3, 9, 5 };
        int low = 0;
        int high = nums.length - 1;

        System.out.println("Array before Quick Sort:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        quickSort(nums, low, high);

        System.out.println("\nArray after Quick Sort:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(nums, low, high);

            quickSort(nums, low, pivotIndex - 1);

            quickSort(nums, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (nums[i] <= pivot && i < high) {
                i++;
            }

            while (nums[j] > pivot && j > low) {
                j--;
            }

            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;

        return j;
    }
}
