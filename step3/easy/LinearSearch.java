// https://takeuforward.org/plus/dsa/problems/linear-search

package step3.easy;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = { 2, -4, 4, 0, 10 };
        int target = 6;
        System.out.println(target + " is at index " + linearSearch(nums, target));
    }

    public static int linearSearch (int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        return -1;
    }
}
