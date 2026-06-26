public class CountInversions {
	public static void countInversions(int[] nums) {
		
	}

	public static void mergesort(int[] nums, int low, int high) {
		int mid = low + (high - low) / 2;
		if (low < high) {
			mergesort(nums, low, mid);
			mergesort(nums, mid + 1, high);
			merge(nums, low, mid, high);
		}
	}

	public static void merge(int[] nums, int start, int mid, int end) {
		int[] left = new int[mid + 1];
		int[] right = new int[end - mid];

		for (int i = start; i <= end; i++) {
			if (i <= mid)
				left[i] = nums[i];
			else 
				right[i - mid - 1] = nums[i];
		}

		int i = start;
		int j = mid + 1;
		int k = start;

		while (i <= mid && j <= end) {
			if (left[i] <= right[j])
				nums[k++] = left[i++];
			else 
				nums[k++] = right[j++];
		}

		while (i <= mid)
			nums[k++] = left[i++];

		while (j <= end) 
			nums[k++] = right[j++];
	}

	public static void main(String[] argv) {
		int[] nums = { 2, 4, 1, 3, 5 };

		mergesort(nums, 0, nums.length - 1);

		for (int num : nums) 
			System.out.print(num + ", ");
	} 
}
