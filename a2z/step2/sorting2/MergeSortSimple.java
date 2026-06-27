package step2.sorting2;

import java.util.Arrays;

public class MergeSortSimple {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 5, 2, 4, 6 };

    System.out.println(Arrays.toString(arr));

    sort(arr);

    System.out.println(Arrays.toString(arr));
  }

  private static void sort (int[] arr) {
    if (arr == null || arr.length <= 1) return;

    int[] temp = new int[arr.length];

    mergeSort(arr, temp, 0, arr.length - 1);
  }

  public static void mergeSort (int[] arr, int[] temp, int start, int end) {
    if (start < end) {
      int mid = start + (end - start) / 2;
      mergeSort(arr, temp, start, mid);
      mergeSort(arr, temp, mid + 1, end);
      merge(arr, temp, start, mid, end);
    }
  }

  public static void merge (int[] arr, int[] temp, int start, int mid, int end) {
    int left = start;
    int right = mid + 1;
    int i = start;

    while (left <= mid && right <= end) {
      if (arr[left] <= arr[right]) {
        temp[i] = arr[left];
        left++;
      } else {
        temp[i] = arr[right];
        right++;
      }
      i++;
    }

    while (left <= mid)
      temp[i++] = arr[left++];

    while (right <= end)
      temp[i++] = arr[right++];

    for (int j = start; j <= end; j++) 
      arr[j] = temp[j];
  }
}
