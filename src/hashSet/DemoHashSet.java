package hashSet;

import java.util.HashSet;

public class DemoHashSet
{
    public static void main(String[] args)
    {
        //CReating a Hashset
        HashSet<Integer> hs = new HashSet<>();

        //adding elements in hashSet
        hs.add(4);
        hs.add(7);
        hs.add(0);
        hs.add(4);
        hs.add(-6);

        //printing HashSet
        System.out.println(hs);

        //SErach in set

        System.out.println(hs.contains(-6));
        System.out.println(hs.contains(9));

        //removing elements from set

        hs.remove(4);
        hs.remove(78);
        System.out.println(hs);
        if(!hs.contains(4))
        {
            System.out.println("Entry of 4 is deleted");
        }

        // getting size of HashSet

        System.out.println(hs.size());

        //checking whether it is empty or have values

        System.out.println(hs.isEmpty());




    }
}
