/**
 * Created by Ting on 1/8/17.
 */
public class Palindrome {
    /*
        Determine if a word is palindrome.
    */
    public static boolean isWordPalindrome(String word) {
        String toCheck = word.toLowerCase();
        int left = 0;
        int right = toCheck.length() - 1;
        while (left <= right) {
            if (left > toCheck.length() || right < 0) {
                return false;
            }
            if (toCheck.charAt(left) != toCheck.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isWordPalindrome("Level"));
    }
}
