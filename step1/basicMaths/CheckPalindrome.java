// https://takeuforward.org/plus/dsa/problems/palindrome-number
/*
You are given an integer n. You need to check whether the number is a
palindrome number or not. Return true if it's a palindrome number, otherwise return false.
A palindrome number is a number which reads the same both left to right and right to left.
Examples:
Input: n = 121
Output: true
Explanation: When read from left to right : 121.
When read from right to left : 121.
Input: n = 123
Output: false
Explanation: When read from left to right : 123.
When read from right to left : 321.
 */

package step1.basicMaths;

public class CheckPalindrome {
    public static void main(String[] args) {
        int number = 9875789;
        System.out.println("Is " + number + " a palindrome?: " + isPalindrome(number));
    }

    public static boolean isPalindrome (int n) {
        int reversedNumber = ReverseANumber.reverseNumber(n);
        return n == reversedNumber;
    }
}
