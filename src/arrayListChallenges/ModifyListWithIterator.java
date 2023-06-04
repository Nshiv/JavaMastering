package arrayListChallenges;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ModifyListWithIterator
{
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        addElements(myList);
        System.out.println(myList);
        // removing elements
        removeElement(myList);
        System.out.println(myList);

    }
    public static List addElements(List list)
    {
        for(int i=0;i<10;i++)
        {
            list.add(i);
        }
        return list;
    }

    public static List removeElement(List list)
    {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext())
        {
            int element = iterator.next();
            if(element%2==0)
            {
                iterator.remove();
            }
        }
       return list;


    }
}
