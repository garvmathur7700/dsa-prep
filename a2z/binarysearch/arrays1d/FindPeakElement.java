package binarysearch.arrays1d;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = { 1 };

        System.out.println("Peak Element Index: " + findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        if (nums.length == 1)
            return 0;

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (
                    (mid - 1 < 0 && nums[mid] > nums[mid + 1]) ||
                    (mid + 1 == nums.length && nums[mid] > nums[mid - 1]) ||
                    ((mid - 1 > -1 && nums[mid] > nums[mid - 1]) && (mid + 1 < nums.length && nums[mid] > nums[mid + 1]))
            )
                return mid;

            if (mid + 1 < nums.length && nums[mid] < nums[mid + 1])
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }
}
