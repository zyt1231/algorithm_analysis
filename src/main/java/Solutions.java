import java.util.*;
/**
 * @author zhou0013
 */
public class Solutions {
//-------------------------------------------------------------------------------------------------------------------------------
    public int maxProfit_121(int[] prices) {
        if(prices.length<2) return 0;
        int min=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0; i<prices.length;i++){
            min = Math.min(min,prices[i]);
            maxProfit = Math.max(maxProfit,prices[i]-min);
        }
        return maxProfit;
    }
//-------------------------------------------------------------------------------------------------------------------------------
    public int climbStairs_70(int n) {
        //dp
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
//-------------------------------------------------------------------------------------------------------------------------------
    public int lengthOfLastWord_58(String s) {
        return s.trim().length() - s.trim().lastIndexOf(" ") -1;
    }
//-------------------------------------------------------------------------------------------------------------------------------
    public int maxSubArray_53(int[] nums) {
        //DP solution
        if(nums.length==1) return nums[0];
        int[] m = new int[nums.length];
        m[0] = nums[0];
        int max=nums[0];
        for(int i=1; i<nums.length; i++){
            m[i] = m[i-1]>0?nums[i] + m[i-1]:nums[i];
            max = Math.max(m[i],max);
        }
        return max;
    }
//-------------------------------------------------------------------------------------------------------------------------------
    public int searchInsert_35(int[] nums, int target) {
      if(nums.length==0) return 0;
            int low=0;
            int high=nums.length-1;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(target==nums[mid]){
                    return mid;
                }
                if(target>nums[mid]) low=mid+1;
                if(target<nums[mid]) high=mid-1;
            }
            return low;
    }
//-------------------------------------------------------------------------------------------------------------------------------
    public int strStr_28(String haystack, String needle) {
        //needle and haystack, substring and string
        for(int i=0; ; i++){
            for(int j=0; ; j++){
                if(j==needle.length()) return i;
                if(i+j==haystack.length()) return -1; 
                if(needle.charAt(j)!= haystack.charAt(i+j)) break; 
            }
        }
    }
//-------------------------------------------------------------------------------------------------------------------------------
    public int removeElement_27(int[] nums, int val) {
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val) {
                nums[j]=nums[i];
                j++;
            }
        }
               return j;
    }
//-------------------------------------------------------------------------------------------------------------------------------
    public int removeDuplicates_26(int[] nums) {
        int j=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[j-1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
//-------------------------------------------------------------------------------------------------------------------------------
    public class ListNode {
        //Definition for singly-linked list.
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode mergeTwoLists_21(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1; 
        if(l1.val < l2.val){
            l1.next = mergeTwoLists_21(l1.next, l2);
            return l1;
        }
        else{
            l2.next = mergeTwoLists_21(l1, l2.next);
            return l2;
        }
    }
//-------------------------------------------------------------------------------------------------------------------------------
    public boolean isValidParentheses_20(String s) {
        // Input "]})", "()[{}]"
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> map = new HashMap<Character, Character>() {
            {
                put('(', ')');
                put('[', ']');
                put('{', '}');
            }
        };
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty() || c != map.get(stack.pop())) {// when stack is empty and input )}] 
                    return false; 
                }
            }
        }
        return stack.isEmpty();
    }
//-------------------------------------------------------------------------------------------------------------------------------
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
//-------------------------------------------------------------------------------------------------------------------------------
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
//-------------------------------------------------------------------------------------------------------------------------------
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
//-------------------------------------------------------------------------------------------------------------------------------
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
//-------------------------------------------------------------------------------------------------------------------------------
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
