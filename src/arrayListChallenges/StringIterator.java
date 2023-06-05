package arrayListChallenges;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringIterator
{
    public static void main(String[] args)
    {
        List mylist =createList();
        System.out.println(mylist);
        System.out.println(charCount(mylist));
    }
    public static List createList()
    {
      List list1 = new ArrayList();
      list1.add("Aramco");
      list1.add("Apple");
      list1.add("Banana");
      list1.add("fruits");
      list1.add("Anchor");
        return list1;
    }
    public static int charCount(List list)
    {
        Iterator<String> iterator = list.iterator();
        int count=0;
        while (iterator.hasNext())
        {
            String string = iterator.next();
            if(string.startsWith("A"))
            {
                count++;
            }
        }
        return count;
    }
}
