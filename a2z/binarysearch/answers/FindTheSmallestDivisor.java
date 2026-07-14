package binarysearch.answers;

public class FindTheSmallestDivisor {
    public static void main(String[] args) {
        int[] nums = { 21212,10101,12121 };
        int threshold = 1_000_000;

        System.out.println("Minimum Divisor: " + smallestDivisor(nums, threshold));
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int left = 1, right = max(nums);

        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int sum = sum (nums, mid);

            if (sum <= threshold) {
                ans = mid;
                right = mid - 1;
            } else
                left = mid + 1;
        }

        return ans;
    }

    private static int sum (int[] nums, int mid) {
        int sum = 0;

        for (int num : nums)
            sum += Math.ceilDiv(num, mid);

        return sum;
    }

    private static int min (int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int num : nums)
            if (num < min) min = num;

        return min;
    }

    private static int max (int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int num : nums)
            if (num > max) max = num;

        return max;
    }
}
