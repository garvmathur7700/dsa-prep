package arrays.hard;

public class ReversePairs {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 2, 3, 1 };
    System.out.println("Total Inversions: " + reversePairs(arr));
  }

  public static int reversePairs(int[] arr) {
    if (arr == null || arr.length <= 1)
      return 0;

    int[] temp = new int[arr.length];

    return mergeSort(arr, temp, 0, arr.length - 1);
  }

  private static long countPairs(int[] arr, int start, int mid, int end) {
    int right = mid + 1;
    long count = 0;

    for (int left = start; left <= mid; left++) {
      while (right <= end && arr[left] > 2L * arr[right])
        right++;
      count += (right - (mid + 1));
    }

    return count;
  }

  private static int mergeSort(int[] arr, int[] temp, int start, int end) {
    int count = 0;
    if (start < end) {
      int mid = start + (end - start) / 2;
      count += mergeSort(arr, temp, start, mid);
      count += mergeSort(arr, temp, mid + 1, end);
      count += countPairs(arr, start, mid, end);
      merge(arr, temp, start, mid, end);
    }
    return count;
  }

  private static void merge(int[] arr, int[] temp, int start, int mid, int end) {
    int left = start;
    int right = mid + 1;
    int i = start;

    while (left <= mid && right <= end) {
      if (arr[left] <= arr[right])
        temp[i++] = arr[left++];
      else
        temp[i++] = arr[right++];
    }

    while (left <= mid)
      temp[i++] = arr[left++];

    while (right <= end)
      temp[i++] = arr[right++];

    for (int j = start; j <= end; j++)
      arr[j] = temp[j];
  }
}
