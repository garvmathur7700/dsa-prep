package step3.hard;

public class CountInversions {
  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1, 0 };
    System.out.println("Total Inversions: " + countInversions(arr));
  }

  public static int countInversions(int[] arr) {
    if (arr == null || arr.length <= 1)
      return 0;

    int[] temp = new int[arr.length];

    return mergeSort(arr, temp, 0, arr.length - 1);
  }

  private static int mergeSort(int[] arr, int[] temp, int start, int end) {
    int count = 0;
    if (start < end) {
      int mid = start + (end - start) / 2;
      count += mergeSort(arr, temp, start, mid);
      count += mergeSort(arr, temp, mid + 1, end);
      count += merge(arr, temp, start, mid, end);
    }
    return count;
  }

  private static int merge(int[] arr, int[] temp, int start, int mid, int end) {
    int left = start;
    int right = mid + 1;
    int i = start;
    int count = 0;

    while (left <= mid && right <= end) {
      if (arr[left] <= arr[right]) {
        temp[i] = arr[left++];
      } else {
        temp[i] = arr[right++];
        count += (mid - left + 1);
      }
      i++;
    }

    while (left <= mid)
      temp[i++] = arr[left++];

    while (right <= end)
      temp[i++] = arr[right++];

    for (int j = start; j <= end; j++)
      arr[j] = temp[j];

    return count;
  }
}
