package step2.sorting2;

import java.util.Arrays;

public class MergeSort2 {
	public static void main (String[] argv) {
		int[] arr = { 7, 8, 5, 6, 2 };
		
		System.out.println(Arrays.toString(arr));

        sort(arr);

		System.out.println(Arrays.toString(arr));
	}

    public static void sort (int[] arr) {
        if (arr == null || arr.length <= 1) return;

        int[] temp = new int[arr.length];

        mergesort(arr, temp, 0, arr.length - 1);
    }

	public static void mergesort (int[] arr, int[] temp, int start, int end) {
		if (start < end) {
			int mid = start + (end - start) / 2;
			mergesort(arr, temp, start, mid);
			mergesort(arr, temp, mid + 1, end);
			merge(arr, temp, start, mid, end);
		}
	}

	public static void merge (int[] arr, int[] temp, int start, int mid, int end) {
		int left = start;
		int right = mid + 1;
		int k = start;

		while (left <= mid && right <= end) {
			if (arr[left] <= arr[right]) {
				temp[k] = arr[left];
				left++;
			} else {
				temp[k] = arr[right];
				right++;
			}
			k++;
		}

		while (left <= mid)
			temp[k++] = arr[left++];

		while (right <= end)
			temp[k++] = arr[right++];

        System.arraycopy(temp, start, arr, start, end + 1 - start);
	}
}
