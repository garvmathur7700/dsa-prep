package step3.medium;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] nums = { -3, 4, 5, 1, -30, -10 };
        System.out.println("Leaders in Array: " + leadersInArray(nums));
    }

    public static List<Integer> leadersInArray (int[] nums) {
        List<Integer> leaders = new ArrayList<>();
        int maxEle = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > maxEle) {
                maxEle = nums[i];
                leaders.addFirst(maxEle);
            }
        }
        return leaders;
    }
}
