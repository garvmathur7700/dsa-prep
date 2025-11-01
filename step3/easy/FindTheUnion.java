// https://takeuforward.org/plus/dsa/problems/union-of-two-sorted-arrays

package step3.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class FindTheUnion {
    public static void main(String[] args) {
        int[] nums1 = { 3, 4, 6, 7, 9, 9 };
        int[] nums2 = { 1, 5, 7, 8, 8 };

        System.out.println("Union Array: " + Arrays.toString(unionArray(nums1, nums2)));
    }

    public static int[] unionArray (int[] nums1, int[] nums2) {
        ArrayList<Integer> unionList = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                if (unionList.isEmpty() || nums1[i] != unionList.getLast())
                    unionList.add(nums1[i]);
                i++;
            } else {
                if (unionList.isEmpty() || nums2[j] != unionList.getLast())
                    unionList.add(nums2[j]);
                j++;
            }
        }

        while (i < nums1.length) {
            if (unionList.getLast() != nums1[i])
                unionList.add(nums1[i]);
            i++;
        }

        while (j < nums2.length) {
            if (unionList.getLast() != nums2[j])
                unionList.add(nums2[j]);
            j++;
        }

        int[] unionArray = new int[unionList.size()];
        for (int index = 0;  index < unionArray.length; index++) {
            unionArray[index] = unionList.get(index);
        }

        return unionArray;
    }
}
