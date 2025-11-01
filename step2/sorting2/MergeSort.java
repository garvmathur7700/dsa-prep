// https://takeuforward.org/plus/dsa/problems/merge-sorting

package step2.sorting2;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 7, 4, 5, 3, 2 };
        System.out.println("Array before Merge Sort: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nArray after Merge Sort: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    // int[] arr = [ 7, 4, 5, 3, 2 ]
    // [ 7, 4, 5 ]              [ 3, 2 ]
    // [ 7, 4 ]     [ 5 ]       [ 3 ] [ 2 ]
    // [ 7 ] [ 4 ]  [ 5 ]       [ 3 ] [ 2 ]
    // [ 4, 7 ] [ 5 ]           [ 2, 3 ]
    // [ 4, 5, 7 ]              [ 2, 3 ]
    // [ 2, 3 ]
    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
            }
        }

        while (left <= mid) {
            temp.add(arr[left++]);
        }

        while (right <= high) {
            temp.add(arr[right++]);
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}
