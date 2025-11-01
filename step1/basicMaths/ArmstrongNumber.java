// https://takeuforward.org/plus/dsa/problems/check-if-the-number-if-armstrong
/*
You are given an integer n. You need to check whether it is an
armstrong number or not. Return true if it is an armstrong number, otherwise return false.
An armstrong number is a number which is equal to the sum of the
digits of the number, raised to the power of the number of digits.
Examples:
Input: n = 153
Output: true
Explanation: Number of digits : 3.
1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.
Therefore, it is an Armstrong number.
Input: n = 12
Output: false
Explanation: Number of digits : 2.
1^2 + 2^2 = 1 + 4 = 5.
Therefore, it is not an Armstrong number.
*/

package step1.basicMaths;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 548834;
        System.out.println("Is " + num + " an Armstrong number?: " + isArmstrong(num));
    }

    public static boolean isArmstrong(int n) {
        int digitCount = (int) Math.floor(Math.log10(n) + 1);

        if (digitCount == 1) return true;
        if (digitCount == 2) return false;

        int sum = 0;
        int originalNum = n;
        for (int i = 1; i <= digitCount; i++) {
            int digit = n % 10;
            n /= 10;
            int multiplier = (int) Math.pow(digit, 3);
            sum += multiplier;
        }

        return (originalNum == sum);
    }
}
