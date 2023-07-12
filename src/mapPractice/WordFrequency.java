/*Given a sentence or a paragraph as input, count the frequency of each word
and store it in a map. Ignore punctuation and consider case-insensitive matches.*/
package mapPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WordFrequency
{
    public static void main(String[] args) {
        String essay ="India is is The best Country and india is going to the Best in the world";
        String[] input = essay.split(" ");
        Map<String,Integer> wordCount = getWordCount(input);
        for(Map.Entry<String,Integer> data : wordCount.entrySet())
                {
                   String key = data.getKey();
                   Integer value = data.getValue();
                    System.out.println(key+ " :"+ value);
                }
    }

    public static Map<String,Integer> getWordCount(String[] array)
    {
        Map<String,Integer> myMap = new HashMap<String,Integer>();
        for(String s : array)
        {
            String word = s.toLowerCase();
            if(!myMap.containsKey(word))
            {
                myMap.put(word,1);
            }
            else
            {
                myMap.put(word,myMap.get(word)+1);
            }
        }return myMap;
    }

}
