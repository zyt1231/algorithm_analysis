import java.util.*;
/**
 * Created by Ting on 1/7/17.
 * Given a list of words, produce an algorithm that will return a list of all anagrams for a specific word.
 */

public class AnagramFinder {
    private final Map<String, List<String>> wordMap = new HashMap<String, List<String>>();

    //按字母顺序排序单词
    private String alphbetize(String word) {
        //把单词转化成 char array
        char[] chars = word.toCharArray();
        //按字母顺序排序
        Arrays.sort(chars);
        String signature = new String(chars);
        return signature;
    }


    public List<String> getAnagrams(List<String> words, String word) {
        //loop though words and organized to map
        for (int i = 0; i < words.size(); i++) {
            String eachWord = words.get(i);
            String eachSignature = alphbetize(eachWord);
            if (wordMap.containsKey(eachSignature)) {
                wordMap.get(eachSignature).add(eachWord);
            } else {
                List<String> anagramList = new ArrayList<String>();
                anagramList.add(eachWord);
                wordMap.put(eachSignature, anagramList);
            }
        }

        //match word
        String signature = alphbetize(word);
        if(wordMap.containsKey(signature)){
            List<String> anagrams = wordMap.get(signature);
            return anagrams;
        }
        return null;
    }


    public static void main(String[] args) {
        List<String> words = Arrays.asList("yes", "sey", "esy", "test", "hello");
        AnagramFinder af = new AnagramFinder();
        System.out.println(af.getAnagrams(words,"yes"));
    }
}
