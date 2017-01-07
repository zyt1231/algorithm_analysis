import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static java.lang.System.out;

public class FibonacciSequence {
    /*
    Write a method that returns a Fibonacci sequence from 1 to n
    */
    public static List<Integer> fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must greater than 0.");
        } else {
            final List<Integer> toReturn = new ArrayList<Integer>(n);
            if (n == 0) {
                return toReturn;
            }
            if (n == 1) {
                toReturn.add(0);
                return toReturn;
            }
            if (n == 2) {
                toReturn.add(0);
                toReturn.add(1);
                return toReturn;
            }
            if (n > 2) {
                toReturn.add(0);
                toReturn.add(1);
                for (int i = 0; i < n - 2; i++) {
                    int a = toReturn.get(toReturn.size() - 1);
                    int b = toReturn.get(toReturn.size() - 2);
                    toReturn.add(a + b);
                }
            }
            return toReturn;
        }
    }

    /*
    Write a method that returns the nth value of Fibonacci sequence.
    */
    private static Map<Integer, Integer> fibCache = new HashMap<Integer, Integer>();

    public static int CachedFibN(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        fibCache.put(0, 0);
        fibCache.put(1, 0);
        fibCache.put(2, 1);
        return recursiveFibN(n);
    }

    private static int recursiveFibN(int n) {
        if (fibCache.containsKey(n)) {
            return fibCache.get(n);
        }
        int value = recursiveFibN(n - 1) + recursiveFibN(n - 2);
        fibCache.put(n, value);
        return value;
    }

    public static void main(String[] args) {
        int n = 9;
        out.println(fibonacci(n));
        FibonacciSequence f = new FibonacciSequence();
        out.println(CachedFibN(n));
    }
}