package arrayListChallenges;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CharVowel
{
    public static void main(String[] args)
    {
        List<Character> myList = createList();
        System.out.println(myList);
        System.out.println(removeVowel(myList));

    }
    public static List createList()
    {
       List<Character> list = new ArrayList<>();
       list.add('q');
       list.add('a');
       list.add('e');
       list.add('i');
       list.add('g');
       list.add('u');
       list.add('o');
       return list;
    }

    public static List<Character> removeVowel(List<Character> mylist)
    {
        Iterator<Character> iterator= mylist.iterator();
        while (iterator.hasNext())
        {
            Character element = iterator.next();
            if(element=='a'|| element=='e'||element=='i'||element=='o'||element=='u')
            {
                iterator.remove();
            }

        }return mylist;

    }
}
