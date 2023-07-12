package setPrepration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<Integer>();
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(7);
        list.add(8);
        Set<Integer> output = removeDuplicate(list);
        System.out.println(output);
    }
    public static Set<Integer> removeDuplicate(List<Integer> list)
    {
        Set<Integer> set = new HashSet<Integer>();
        set.addAll(list);
        return set;
    }


}