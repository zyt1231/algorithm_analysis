/*
 * Created by Ting on 1/7/17.
 */

import java.util.ArrayList;
import java.util.List;

public class Factorial {
    /*
     Write a factorial implementation that does not use recursion.
    */
    public static long iterativeFactorial(int n) {
        if (n == 0) {
            throw new IllegalArgumentException("n must greater than 0. ");
        }
        long toReturn = 1;
        for (int i = 1; i <= n; i++) {
            toReturn *= i;

        }
        return toReturn;
    }

    /*
     Write a factorial implementation that use recursion.
    */
    public static long recursionFactorial(int n) {
        if (n == 0) {
            throw new IllegalArgumentException("n must greater than 0.");
        }
        return recursion(n);
    }

    private static long recursion(int n) {
        if (n == 1) {
            return 1;
        }
        return recursion(n - 1) * n;
    }

    public static void main(String[] args) {
        System.out.println(iterativeFactorial(7));
        System.out.println(recursionFactorial(7));
    }
}