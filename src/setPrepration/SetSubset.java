/*Check Subset: Write a function that checks if one set is a subset of another set.*/
package setPrepration;

import java.util.HashSet;
import java.util.Set;

public class SetSubset
{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>(Set.of(4,6,7,12,56,78));
        Set<Integer> set1 = new HashSet<Integer>(Set.of(4,6,7,0));
        System.out.println(checkSubset(set,set1));

    }
    public static boolean checkSubset(Set<Integer> set1, Set<Integer> set2)
    {
        if(set1.containsAll(set2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
