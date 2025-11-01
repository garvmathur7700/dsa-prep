// https://takeuforward.org/plus/dsa/problems/highest-occurring-element-in-an-array

/*
Given an array nums of n integers, find the most frequent element in it i.e.,
the element that occurs the maximum number of times. If there are
multiple elements that appear a maximum number of times,
find the smallest of them.
Examples:
Input: nums = [1, 2, 2, 3, 3, 3]
Output: 3
Explanation: The number 3 appears the most (3 times). It is the most frequent element.
Input: nums = [4, 4, 5, 5, 6]
Output: 4
Explanation: Both 4 and 5 appear twice, but 4 is smaller. So, 4 is the most frequent element.
 */

package step1.hashing;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {
    public static void main(String[] args) {
        int[] nums = {5, 5, 3, 3, 3, 1, 1};
        System.out.println("Most Frequent Element: " + mostFreqElement(nums));
    }

    public static int mostFreqElement(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            int key = num;
            int freq = 0;
            if (mp.containsKey(key)) freq = mp.get(key);
            freq++;
            mp.put(key, freq);
        }

        int highestFrequency = 0;
        int mostFreqElement = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > highestFrequency) {
                highestFrequency = entry.getValue();
                mostFreqElement = entry.getKey();
            } else if(entry.getValue() == highestFrequency && entry.getKey() < mostFreqElement) {
                mostFreqElement = entry.getKey();
            }
        }
        return mostFreqElement;
    }
}