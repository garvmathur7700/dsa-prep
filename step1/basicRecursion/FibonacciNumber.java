// https://takeuforward.org/plus/dsa/problems/fibonacci-number

/*
The Fibonacci numbers, commonly denoted F(n) form a sequence, called
the Fibonacci sequence, such that each number is the sum of the
two preceding ones, starting from 0 and 1. That is,
F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).
Examples:
Input : n = 2
Output : 1
Explanation : F(2) = F(1) + F(0) => 1 + 0 => 1.
Input : n = 3
Output : 2
Explanation : F(3) = F(2) + F(1) => 1 + 1 => 2.
 */

package step1.basicRecursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 7;
        System.out.println("Fibonacci(" + n + ") is : " + fibonacci(n));
    }

    public static int fibonacci (int n) {
        if (n < 3) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
