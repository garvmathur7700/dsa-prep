package binarysearch.answers;

public class CapacityToShipPackages {
  public static void main(String[] args) {
    int[] weights = { 1, 2, 3, 1, 1 };
    int days = 4;

    System.out.println("Minimum Ship Capacity needed: " + shipWithinDays(weights, days));
  }

  public static int shipWithinDays(int[] weights, int days) {
    int left = max(weights), right = sum(weights);

    int ans = 0;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      int calculatedDays = calculateDays(weights, mid);

      if (calculatedDays <= days) {
        ans = mid;
        right = mid - 1;
      } else
        left = mid + 1;
    }

    return ans;
  }

  private static int calculateDays(int[] weights, int capacity) {
    int days = 0;

    int sum = 0;

    for (int weight : weights) {
      if (sum < capacity)
        sum += weight;
      if (sum == capacity) {
        days++;
        // days += sum / capacity;
        sum = 0;
      }
      if (sum > capacity) {
        days++;
        // days += sum / capacity;
        sum = weight;
      }
    }
    // days += sum / capacity;
    if (sum != 0)
      days++;

    return days;
  }

  private static int sum(int[] nums) {
    int sum = 0;

    for (int num : nums)
      sum += num;

    return sum;
  }

  private static int max(int[] nums) {
    int max = Integer.MIN_VALUE;

    for (int num : nums)
      if (num > max) max = num;

    return max;
  }
}
