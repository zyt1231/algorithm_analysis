/**
 * Created by Ting on 1/7/17.
 * Write a method to reverse a String.
 */
public class ReverseString {
    /**
     * Reverse a String using a Stringbuilder.
     */
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    /**
     * Reverse a String in place.
     */
    public static String inplaceReverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length() / 2; i++) {
            char tmp = sb.charAt(i);
            char endN = sb.charAt(sb.length() - i - 1);
            sb.setCharAt(i, endN);
            sb.setCharAt(sb.length() - 1 - i, tmp);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("yutingzhou"));
        System.out.println(inplaceReverse("yutingzhou"));
    }
}
