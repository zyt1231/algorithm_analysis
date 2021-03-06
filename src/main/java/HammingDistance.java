/**
 * Created by Ting on 1/18/17.
 */
public class HammingDistance {
    /*  The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
        Given two integers x and y, calculate the Hamming distance.
                Note:
                0 ≤ x, y < 231.
        Example:
        Input: x = 1, y = 4
        Output: 2
        Explanation:
                1   (0 0 0 1)
                4   (0 1 0 0)
                       ↑   ↑
        The above arrows point to positions where the corresponding bits are different.
    */
    public static int solution(int x, int y) {
        /* 为什么32？
        int res = x ^ y;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((res & 1) != 0) {
                count++;
            }
            res >>= 1;
        }
        return count;
        */
        int res = 0;
        int xor = x ^ y;
        while (xor > 0) {
            ++res;
            xor &= (xor - 1); // xor&(xor-1)可以快速移除右边的bit1
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(solution(1, 100));

    }
}
