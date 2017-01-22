/**
 * Created by Ting on 1/21/17.
 */
public class NumberComplement {
    public static int solution(int num) {
        System.out.println("binary bits of num:" + Integer.toBinaryString(num));
        System.out.println("binary bits of HigestOneBit of num:" + Integer.toBinaryString(Integer.highestOneBit(num)));
        int mask = (Integer.highestOneBit(num) << 1) - 1;
        System.out.println("binary bits of mask:" + Integer.toBinaryString(mask));
        num = ~num;
        return num & mask;
    }

    public static void main(String[] args) {
        System.out.println(solution(12));
    }
}
