import java.util.*;
/**
 * @author zhou0013
 */
public class Solutions {
    public String longestCommonPrefix_12__2(String[] strs) {
        //Vertical scanning
        if(strs == null || strs.length == 0) return "";
        for(int i = 0; i<strs[0].length(); i++){ //string.length() vs array.length
            char c = strs[0].charAt(i);
            for(int j = 0; j< strs.length; j++){
                if(strs[j].charAt(i)!=c || j==strs[i].length()) return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
    
    public String longestCommonPrefix_14__1(String[] strs) {
        //Horisontal scanning
        if (strs.length == 0) {return "";}
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {return "";}
            }
        }
        return prefix;
    }    
    
    public boolean isPalindrome_9(int x) {
        //input :  0 true, 100 false, 2 true, -121 false
        int rev = 0;
        if (x<0 || (x!=0 && x%10==0)) return false; 
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x = (x - x % 10) / 10;
        }
        return (x == rev || x == rev / 10);
    }
    
    public int[] twoSum_1() {
        final int[] nums = {2, 7, 11, 15};
        final int target = 9;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    //System.out.println(i);
                    
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public int reverse_7(int x) {
    //Java reverse an int value - Principles
    //Modding (%) the input int by 10 will extract off the rightmost digit. example: (1234 % 10) = 4.
    //Multiplying an integer by 10 will "push it left" exposing a zero to the right of that number, example: (5 * 10) = 50.
    //Dividing an integer by 10 will remove the rightmost digit. 
        int toReturn = 0;
        int target = x; //123
        while (target!=0){
            int tmp = target % 10; //get mod result
            target = (target - tmp) / 10; //shift lefft
            if (toReturn * 10 != ((long)toReturn)*10){
                return 0;
            }
            toReturn = toReturn * 10 + tmp;
        }
        return toReturn;  
    }
    
}
