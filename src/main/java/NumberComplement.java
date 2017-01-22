/**
 Created by Ting on 1/21/17.
 Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

 Note:
 The given integer is guaranteed to fit within the range of a 32-bit signed integer.
 You could assume no leading zero bit in the integer’s binary representation.
 Example 1:
 Input: 5
 Output: 2
 Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
 Example 2:
 Input: 1
 Output: 0
 Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
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
