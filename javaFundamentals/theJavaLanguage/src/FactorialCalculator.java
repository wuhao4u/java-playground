import java.util.Arrays;

public class FactorialCalculator {
    public static long factorialRecursive(long x) {
        if (x < 0) {
            System.out.println("Invalid input!");
            return -1;
        }

        // base case
        if (x == 0 || x == 1) {
            return 1;
        }

        return x * factorialRecursive(x - 1);
    }

    public static long factorialIterative(long x) {
        if (x < 0) {
            System.out.println("Invalid input!");
            return -1;
        }

        long res = 1;

        int i = 1;
        while (i < x + 1) {
            res *= i;
            ++i;
        }

        return res;
    }

    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();
        System.out.println(calculator.factorialRecursive(0));
        System.out.println(calculator.factorialRecursive(1));
        System.out.println(calculator.factorialRecursive(2));
        System.out.println(calculator.factorialRecursive(5));
        System.out.println(calculator.factorialRecursive(10));
        System.out.println(calculator.factorialRecursive(20));

        // print a separator
        char[] sepChars = new char[80];
        Arrays.fill(sepChars, '-');
        String sep80 = new String(sepChars);
        System.out.println(sep80);

        System.out.println(calculator.factorialIterative(0));
        System.out.println(calculator.factorialIterative(1));
        System.out.println(calculator.factorialIterative(2));
        System.out.println(calculator.factorialIterative(5));
        System.out.println(calculator.factorialIterative(10));
        System.out.println(calculator.factorialIterative(20));
    }
}
