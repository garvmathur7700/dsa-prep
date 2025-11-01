// https://takeuforward.org/plus/dsa/problems/count-all-digits-of-a-number

/*
* You are given an integer n. You need to return the number of digits in the number.
* The number will have no leading zeroes, except when the number is 0 itself.
* Examples
* Input: n = 4
* Output: 1
* Explanation: There is only 1 digit in 4.
* Input: n = 14
* Output: 2
* Explanation: There are 2 digits in 14.
*/

package step1.basicMaths;

public class CountDigits {
    public static void main(String[] args) {
        int number = 0;
        System.out.println("Number of digits in " + number + " are : " + countDigit(number));
    }

    // this method will take in a number,
    // then perform log10 on it and then add 1
    // since log of any number under 10 will be 0
    // adding 1 will give the digit count. Same with numbers under 100/1000/etc.
    public static int countDigit(int number) {
        if (number == 0) return 1;
        double log10OfNumber = Math.log10(number);
        int noOfDigits = (int) Math.floor(log10OfNumber);
        return noOfDigits + 1;
    }
}