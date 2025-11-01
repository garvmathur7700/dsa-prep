// https://takeuforward.org/plus/dsa/problems/largest-element

/*
Given an array of integers nums, return the value of the largest element in the array.
Examples:
Input: nums = [3, 3, 6, 1]
Output: 6
Explanation: The largest element in array is 6
Input: nums = [3, 3, 0, 99, -40]
Output: 99
Explanation: The largest element in array is 99
*/

package step3.easy;

public class LargestElement {
    public static void main(String[] args) {
        int[] nums = { -4, -3, 0, 1, -8 };
        System.out.println("The largest element in array is " + largestElement(nums));
    }

    public static int largestElement (int[] nums) {
        int largestElement = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > largestElement)
                largestElement = num;
        }

        return largestElement;
    }
}
