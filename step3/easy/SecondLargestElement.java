// https://takeuforward.org/plus/dsa/problems/second-largest-element

/*
Given an array of integers nums, return the second-largest element in the array.
If the second-largest element does not exist, return -1.
Examples:
Input: nums = [8, 8, 7, 6, 5]
Output: 7
Explanation: The largest value in nums is 8, the second largest is 7
Input: nums = [10, 10, 10, 10, 10]
Output: -1
Explanation: The only value in nums is 10, so there is no second-largest value, thus -1 is returned.
 [7, 7, 2, 2, 10, 10, 10]
 */

package step3.easy;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] nums = { 8, 8, 7, 6, 5 };
        System.out.println("Second largest element in the array: " + secondLargestElement(nums));
    }

    public static int secondLargestElement (int[] nums) {
        if (nums.length < 2) return -1;

        int largestElement = Integer.MIN_VALUE;
        int secondLargestElement = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largestElement) {
                secondLargestElement = largestElement;
                largestElement = num;
            } else if (num > secondLargestElement && num != largestElement) {
                secondLargestElement = num;
            }
        }

        if (largestElement == secondLargestElement || secondLargestElement == Integer.MIN_VALUE)
            return -1;

        return secondLargestElement;
    }
}
