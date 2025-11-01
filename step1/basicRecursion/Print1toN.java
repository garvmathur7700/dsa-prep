// https://takeuforward.org/plus/dsa/problems/print-1-to-n-using-recursion
/*
Given an integer n, write a function to print all numbers from 1 to n (inclusive) using recursion.
You must not use any loops such as for, while, or do-while.
The function should print each number on a separate line, in increasing order from 1 to n.
Examples:
Input: n = 5
Output:
1
2
3
4
5
Input: n = 1
Output:
1
Constraints:
1 <= n <= 100
 */

package step1.basicRecursion;

public class Print1toN {
    public static void main(String[] args) {
        print1toN(1, 5);
    }

    public static void print1toN(int i, int n) {
        if (i > n) return;
        System.out.println(i);
        print1toN(i + 1, n);
    }
}
