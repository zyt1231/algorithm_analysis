
//*
Given  an  arbitrary  ransom  note  string  and  another  string  containing  letters from  all  the  magazines,  write  a  function  that  will  return  true  if  the  ransom   note  can  be  constructed  from  the  magazines ;  otherwise,  it  will  return  false.   

Each  letter  in  the  magazine  string  can  only  be  used  once  in  your  ransom  note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct(“a”, “b”) -> false
canConstruct(“aa”, “ab”) -> false
canConstruct(“aa”, “aab”) -> true
*//


public class RansomeNote{
    public static boolean canConstruct(String ransomeNote, String magzine){
        if(ransomeNote.length()>magzine.length()){
            throw new IllegalArgumentException("Length of ransome note should be greater than magzine.");
        }
        java.lang.StringBuilder sbMagzine = new java.lang.StringBuilder(magzine);
        for(int i=0; i< ransomeNote.length(); i++){
            char c = ransomeNote.charAt(i);
            System.out.println(c);
            int index = sbMagzine.toString().indexOf(c);
            if (index>=0){
                sbMagzine.deleteCharAt(index);
                continue;
            }
            return false;
        }
        return true;
    }
     public static void main(String []args){
        System.out.println(canConstruct("aba","ab"));
     }
}
