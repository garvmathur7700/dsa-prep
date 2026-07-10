package binarysearch.answers;

class MinDayForBouquet {
  public int minDays(int[] bloomDay, int m, int k) {
    if (m * k > bloomDay.length)
      return -1;

    int start = min(bloomDay), end = max(bloomDay);

    int minDay = -1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      int bouquetCount = calculatePossibleBouquets(bloomDay, k, mid);

      if (bouquetCount >= m) {
        minDay = mid;
        end = mid - 1;
      } else
        start = mid + 1;
    }

    return minDay;
  }

  private int calculatePossibleBouquets(int[] bloomDay, int k, int mid) {
    int bouquetCount = 0;

    int count = 0;
    for (int bloom : bloomDay) {
      if (bloom <= mid)
        count++;
      else {
        bouquetCount += count / k;
        count = 0;
      }
    }
    bouquetCount += count / k;

    return bouquetCount;
  }

  private int min(int[] nums) {
    int min = Integer.MAX_VALUE;

    for (int num : nums)
      if (num < min)
        min = num;

    return min;
  }

  private int max(int[] nums) {
    int max = Integer.MIN_VALUE;

    for (int num : nums)
      if (num > max)
        max = num;

    return max;
  }
}
