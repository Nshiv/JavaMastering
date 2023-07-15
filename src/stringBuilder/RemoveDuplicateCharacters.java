package stringBuilder;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacters
{
    public static void main(String[] args) {
        String s = "Indian Standards and its corelations";
        String s1 = removeDuplicate(s);
        System.out.println(s1);



    }
    public static String removeDuplicate(String str)
    {
        String str1 = str.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        Set<Character> myset = new HashSet<Character>();
        for(int i=0;i<str1.length();i++)
        {
            char character = str1.charAt(i);
            if(myset.add(character))
            {
                stringBuilder.append(character);
            }
        } return stringBuilder.toString();
    }
}
