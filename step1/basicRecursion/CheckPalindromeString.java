// https://takeuforward.org/plus/dsa/problems/check-if-string-is-palindrome-or-not-

/*
Given a string s, return true if the string is palindrome, otherwise false.
A string is called palindrome if it reads the same forward and backward.
Examples:
Input : s = "hannah"
Output : true
Explanation : The string when reversed is --> "hannah", which is same as original string , so we return true.
Input : s = "aabaa"
Output : false
Explanation : The string when reversed is --> "aaabbaa", which is not same as original string, So we return false.
 */

package step1.basicRecursion;

public class CheckPalindromeString {
    public static void main(String[] args) {
        String s = "aabbaaa";
        System.out.println("Is string " + s + " palindrome?: " + isPalindromeString(s, 0, s.length() - 1));
    }

    public static boolean isPalindromeString(String s, int start, int end) {
        if (start > end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindromeString(s, start + 1, end - 1);
    }
}