// https://takeuforward.org/plus/dsa/problems/reverse-a-number
/*
 * You are given an integer n. Return the integer formed by placing the digits of n in reverse order.
 * Examples:
 * Input: n = 25
 * Output: 52
 * Explanation: Reverse of 25 is 52.
 * Input: n = 123
 * Output: 321
 * Explanation: Reverse of 123 is 321.
 */

package step1.basicMaths;

public class ReverseANumber {
    public static void main(String[] args) {
        int number = 123;
        System.out.println("Reverse of " + number + " is: " + reverseNumber(number));
    }

    public static int reverseNumber(int n) {
        int digitCount = (int) Math.floor(Math.log10(n) + 1);

        if (digitCount <= 1) return n;

        int reversedNumber = 0;

        for (int i = 0; i < digitCount; i++) {
            int remainder = n % 10;
            n /= 10;
            int multiplier = (int) Math.pow(10, digitCount - i - 1);
            reversedNumber += remainder * multiplier;
        }

        return reversedNumber;
    }
}
