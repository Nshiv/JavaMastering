package mapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOfOccurences
{
    public static void main(String[] args) {

        String s = "Lets do it today itself";
        char[] chars = s.toCharArray();
        Map<Character,Integer> myset = getCountandOccurences(chars);
        System.out.println(myset);

    }

    public static Map<Character,Integer> getCountandOccurences(char[] chars)
    {
        Map<Character,Integer>  map = new HashMap<Character, Integer>();

       for(char c : chars)
       {
           if(!map.containsKey(c))
           {
               map.put(c,1);
           }
           else
           {
               map.put(c,map.get(c)+1);
           }

       }return map;
    }
}
