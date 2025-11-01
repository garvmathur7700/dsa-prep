// https://takeuforward.org/plus/dsa/problems/sum-of-first-n-numbers
/*
Given an integer N, return the sum of first N natural numbers. Try to solve this using recursion.
Examples:
Input : N = 4
Output : 10
Explanation : first four natural numbers are 1, 2, 3, 4.
Sum is 1 + 2 + 3 + 4 => 10.
Input : N = 2
Output : 3
Explanation : first two natural numbers are 1, 2.
Sum is 1 + 2 => 3.
 */

package step1.basicRecursion;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfNNumbers(5));
    }

    public static int sumOfNNumbers(int n) {
        if (n == 0) return 0;

        return n + sumOfNNumbers(n - 1);
    }
}
