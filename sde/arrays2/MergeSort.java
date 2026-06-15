import java.util.Arrays;

public class MergeSort {
	public static void mergesort(int[] nums) {
		if (nums.length <= 1) return;

		int middle = nums.length / 2;
		int[] left = new int[middle];
		int[] right = new int[nums.length - middle];

		for (int i = 0; i < middle; i++) left[i] = nums[i];
		for (int i = middle; i < nums.length; i++) right[i - middle] = nums[i];

		mergesort(left);
		mergesort(right);
		merge(nums, left, right);
	}

	public static void merge(int[] nums, int[] left, int[] right) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] <= right[j])
				nums[k] = left[i++];
			else
				nums[k] = right[j++];

			k++;
		}

		while (i < left.length) nums[k++] = left[i++];

		while (j < right.length) nums[k++] = right[j++];
	}

	public static void main (String[] argv) {
		int[] nums = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

		mergesort(nums);

		System.out.println(Arrays.toString(nums));
	}
}
