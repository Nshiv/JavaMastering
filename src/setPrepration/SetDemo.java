package setPrepration;

import java.util.HashSet;
import java.util.Set;

public class SetDemo
{
    public static void main(String[] args) {
        String s = "Hello world";
         char[] chars = s.toCharArray();
         Set<Character> myset = new HashSet<Character>();
         for(int i=0;i<chars.length;i++)
         {
             if(!myset.add(chars[i]))
             {
                 System.out.println("Postition "+i + "chars are " + chars[i]);
             }
         }


    }
}
