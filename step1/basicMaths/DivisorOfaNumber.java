// https://takeuforward.org/plus/dsa/problems/divisors-of-a-number
/*
You are given an integer n. You need to find all the divisors of n.
Return all the divisors of n as an array or list in a sorted order.
A number which completely divides another number is called its divisor.
Examples:
Input: n = 6
Output = [1, 2, 3, 6]
Explanation: The divisors of 6 are 1, 2, 3, 6.
Input: n = 8
Output: [1, 2, 4, 8]
Explanation: The divisors of 8 are 1, 2, 4, 8.
 */

package step1.basicMaths;

import java.util.ArrayList;
import java.util.List;

public class DivisorOfaNumber {
    public static void main(String[] args) {
        int number = 12;
        System.out.println("Divisors of " + number + " are: " + divisors(number));
    }

    public static List<Integer> divisors (int n) {
        ArrayList<Integer> divisors = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) divisors.add(i);
        }

        return divisors;
    }
}
