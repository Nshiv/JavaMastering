package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorHashSet
{
    public static void main(String[] args)
    {
        HashSet<String> set = new HashSet<>();
        set.add("India");
        set.add("China");
        set.add("US");
        set.add("Japan");
        set.add("Germany");
        set.add("Germany");
        System.out.println(set);

        //Creating an Iterator
        Iterator it = set.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
