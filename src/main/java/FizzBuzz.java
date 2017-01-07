import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ting on 1/6/17.
 * Write an algorithm that prints all numbers between 1 and n,
 * replacing multiples of 3 with the String Fizz, multiples of 5 with Buzz, and multiples of 15 with FizzBuzz.
 */

public class FizzBuzz {
    public static List<String> SimpleFizzBuzz(int n) {
        final ArrayList<String> toReturn = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                toReturn.add("FizzBuzz");
            } else if (i % 5 == 0) {
                toReturn.add("Buzz");
            } else if (i % 3 == 0) {
                toReturn.add("Fizz");
            }else{
                toReturn.add("");
            }
        }
        return toReturn;
    }

    public static List<String> AlternativeFizzBuzz(final int n) {
        final List<String> toReturn = new ArrayList<String>(n);
        for (int i = 1; i<=n; i++){
            String word = toWord(15, i,"FizzBuzz");
            if (word == "") {
                word =toWord(5, i,"Buzz") + toWord(3, i,"Fizz");;
            }
            toReturn.add(word);
        }
        return toReturn;
    }
    private static String toWord(final int divisor,
                                 final int value,
                                 final String word){
        if (divisor != 0){
            return value % divisor == 0 ? word : "";
        }
        else{
            return "Argument divisor is 0.";
        }
    }

    public static void main(String[] args) {
        System.out.println(SimpleFizzBuzz(100)); //println `ln` means line
        System.out.println(AlternativeFizzBuzz(100));
    }
}

