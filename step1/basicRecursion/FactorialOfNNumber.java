package step1.basicRecursion;

public class FactorialOfNNumber {
    public static void main(String[] args) {
        System.out.println(factorial(9));
    }

    public static int factorial(int n) {
        if (n < 2) return 1;

        return n * factorial(n - 1);
    }
}
