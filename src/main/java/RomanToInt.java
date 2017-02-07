import java.util.Map;

/*
Given a roman numeral, convert it to an integer.
Input is guaranteed to be within the range from 1 to 3999.

罗马数字是最古老的数字表示方式，比阿拉伯数组早2000多年，起源于罗马
罗马数字有如下符号：
基本字符	        I	V	X	  L	   C	  D	    M
对应阿拉伯数字	1	5	10	  50   100	  500	1000
计数规则：
相同的数字连写，所表示的数等于这些数字相加得到的数，例如：III = 3
小的数字在大的数字右边，所表示的数等于这些数字相加得到的数，例如：VIII = 8
小的数字，限于（I、X和C）在大的数字左边，所表示的数等于大数减去小数所得的数，例如：IV = 4
正常使用时，连续的数字重复不得超过三次
在一个数的上面画横线，表示这个数扩大1000倍（本题只考虑3999以内的数，所以用不到这条规则）
*/
class RomanToInt {
    public static int romanToInt(String romanStr){
        if (romanStr.length()==0 || romanStr==null){
            return 0;
        }
        romanStr = romanStr.toUpperCase();
        Map<Character,Integer> map = new java.util.HashMap<Character,Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int toReturn=map.get(romanStr.charAt(romanStr.length()-1));
        for(int i=0; i<romanStr.length()-1;i++){
            char current = romanStr.charAt(i);
            char next = romanStr.charAt(i+1);
            if(map.get(current)>=map.get(next)){
                toReturn += map.get(current);
            }
            if(map.get(current)<map.get(next)){
                toReturn -= map.get(current);
            }
        }
        return toReturn;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("DXI"));
    }
}