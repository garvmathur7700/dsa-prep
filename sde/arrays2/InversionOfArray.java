// https://takeuforward.org/plus/dsa/problems/count-inversions?source=strivers-sde-sheet

public class InversionOfArray {
	public static int numberOfInversions (int[] nums) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[i]) 
					count++;
			}
		}

		return count;
	}

	public static int numberOfInversionsOptimized (int[] nums) {
		return mergesort(nums);
	}

	public static int mergesort(int[] nums) {
		if (nums.length <= 1) return 0;

		int middle = nums.length / 2;
		int[] left = new int[middle];
		int[] right = new int[nums.length - middle];

		for (int i = 0; i < middle; i++) left[i] = nums[i];
		for (int i = middle; i < nums.length; i++) right[i - middle] = nums[i];

		int count = 0;

		count += mergesort(left);
		count += mergesort(right);
		count += merge(nums, left, right);

		return count;
	}

	public static int merge(int[] nums, int[] left, int[] right) {
		int i = 0;
		int j = 0;
		int k = 0;

		int count = 0;

		while (i < left.length && j < right.length) {
			if (left[i] <= right[j])
				nums[k] = left[i++];
			else {
				nums[k] = right[j++];
				count += (left.length - i);
			}
			k++;
		}

		while (i < left.length) nums[k++] = left[i++];

		while (j < right.length) nums[k++] = right[j++];

		return count;
	}

	public static void main (String[] argv) {
		int[] nums = { 2,3,7,1,3,5 };

		System.out.println(numberOfInversionsOptimized(nums));
	}
}
