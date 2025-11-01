// https://takeuforward.org/plus/dsa/problems/reverse-an-array

/*
Given an array arr of n elements. The task is to reverse the given array. The reversal of array should be inplace.
Examples:
Input: n=5, arr = [1,2,3,4,5]
Output: [5,4,3,2,1]
Explanation: The reverse of the array [1,2,3,4,5] is [5,4,3,2,1]
Input: n=6, arr = [1,2,1,1,5,1]
Output: [1,5,1,1,2,1]
Explanation: The reverse of the array [1,2,1,1,5,1] is [1,5,1,1,2,1].
 */

package step1.basicRecursion;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 5, 1};
        System.out.println("Original Array: " + Arrays.toString(arr));
        reverseArray(arr, arr.length, 0, arr.length - 1);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr, int n, int start, int end) {
        int mid = n / 2;
        if (start > mid || end < mid) return;
        swap(arr, start, end);
        reverseArray(arr, n, start + 1, end - 1);
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
