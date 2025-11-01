// https://leetcode.com/problems/majority-element/description/

package step3.medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = { 2,2,1,1,1,1,2,2 };
        System.out.println("Majority Element: " + majorityElementOptimal(nums));
    }

    public static int majorityElement (int[] nums) {
        Map<Integer, Integer> mpp = new HashMap<>();
        int highestFreq = nums.length / 2;
        int majorityElement = -1;
        for (int num : nums) {
            int freq = 0;
            if (mpp.containsKey(num)) freq = mpp.get(num);
            freq++;
            mpp.put(num, freq);
            if (freq > highestFreq) {
                highestFreq = freq;
                majorityElement = num;
            }
        }

        return majorityElement;
    }

    // Using Moore's Voting Algorithm
    public static int majorityElementOptimal (int[] nums) {
        int currentElement = 0;
        int elementCount = 0;

        for (int num : nums) {
            if (elementCount == 0) {
                elementCount = 1;
                currentElement = num;
            } else if (num == currentElement)
                elementCount++;
            else
                elementCount--;
        }

        // Check if currentElement is the majorityElement
        /*
        To Check that we go through the array and get `currentElement`'s frequency and
        if it is greater that half of array length, then there is a majority element.
         */
        int counter = 0;
        for (int i : nums) {
            if (i == currentElement) counter++;
        }
        if (counter > nums.length / 2) return currentElement;

        return -1;
    }
}
