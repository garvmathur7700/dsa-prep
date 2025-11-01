// https://takeuforward.org/plus/dsa/problems/check-for-prime-number
/*
You are given an integer n. You need to check if the number is prime or not.
Return true if it is a prime number, otherwise return false.
A prime number is a number which has no divisors except 1 and itself.
Examples:
Input: n = 5
Output: true
Explanation: The only divisors of 5 are 1 and 5 , So the number 5 is prime.
Input: n = 8
Output: false
Explanation: The divisors of 8 are 1, 2, 4, 8, thus it is not a prime number.
 */

package step1.basicMaths;

import java.util.ArrayList;
import java.util.List;

public class CheckForPrime {
    public static void main(String[] args) {
        int num = 11;
        System.out.println("Is " + num + " a prime number?: " + isPrime(num));
    }

    public static boolean isPrime(int n){
        List<Integer> divisors = DivisorOfaNumber.divisors(n);
        List<Integer> primeDivisors = new ArrayList<>();
        primeDivisors.add(1);
        primeDivisors.add(n);

        return primeDivisors.equals(divisors);
    }
}
