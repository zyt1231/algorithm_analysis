import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ting on 1/6/17.
 * Write an algorithm that prints all numbers between 1 and n,
 * replacing multiples of 3 with the String Fizz, multiples of 5 with Buzz, and multiples of 15 with FizzBuzz.
 */

public class FizzBuzz {
    public List<String> SimpleFizzBuzz(int n) {
        final ArrayList<String> toReturn = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                toReturn.add("FizzBuzz");
            } else if (i % 5 == 0) {
                toReturn.add("Buzz");
            } else if (i % 3 == 0) {
                toReturn.add("Fizz");
            }
        }
        return toReturn;
    }

    public void TestSimpleFizzBuzz() {

    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

