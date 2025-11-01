// https://takeuforward.org/plus/dsa/problems/print-n-to-1-using-recursion
/*
Given an integer n, write a function to print all numbers from n to 1 (inclusive) using recursion.
You must not use any loops such as for, while, or do-while.
The function should print each number on a separate line, in decreasing order from n to 1
Examples:
Input: 5
Output:
5
4
3
2
1
Input: 1
Output:
1
 */

package step1.basicRecursion;

public class PrintNto1 {
    public static void main(String[] args) {
        int n = 5;
        printNto1(n, n);
    }

    public static void printNto1(int i, int n) {
        if (i < 1) return ;
        System.out.println(i);
        printNto1(i - 1, n);
    }
}
