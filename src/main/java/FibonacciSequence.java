import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;
/*
 * Created by Ting on 1/7/17.
 * Write a method that returns a Fibonacci sequence from 1 to n
 */

public class FibonacciSequence {
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

    public static void main(String[] args) {
        out.println(fibonacci(20));

    }
}