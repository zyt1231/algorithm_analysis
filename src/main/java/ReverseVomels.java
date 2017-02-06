/*

    Write a function that takes a string as input and reverse only the vowels of a string.

    Example 1:
    Given s = "hello", return "holle".

    Example 2:
    Given s = "leetcode", return "leotcede".

    Note:
    The vowels does not include the letter "y".

*/
class ReverseVomels
{
    public static boolean ifVomel(char c){
        String vowels = "aeiouAEIOU";
        if (vowels.indexOf(c)>=0){
            return true;
        }
        return false;
    }
    public static String reverseVomels(String s){
        char[] chars = s.toCharArray();
        int pStart = 0;
        int pEnd = s.length()-1;
        char tmp;
        while(pStart<pEnd){
            char c = s.charAt(pStart);
            if(ifVomel(chars[pStart]) && ifVomel(chars[pEnd])){
                tmp = chars[pEnd];
                chars[pEnd] = chars[pStart];
                chars[pStart] = tmp;
                pStart++;
                pEnd--;
            }
            else{
                if(!ifVomel(chars[pStart])){
                    pStart ++;
                }
                if(!ifVomel(chars[pEnd])){
                    pEnd--;
                }
            }
        }
        
        return new String(chars); 
    }
    
     public static void main(String []args){
         System.out.println(ifVomel('d'));
         System.out.println(reverseVomels("leetcode"));
         System.out.println(reverseVomels("hello"));
     }
}
