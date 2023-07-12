package setPrepration;

import javax.print.DocFlavor;
import java.util.HashSet;
import java.util.Set;

public class SetIntersection
{
    public static void main(String[] args)
    {
        Set<Integer> set = new HashSet<Integer>(Set.of(4,6,7,12,56,78));
        Set<Integer> set1 = new HashSet<Integer>(Set.of(4,6,7,19,345,748));
        Set<Integer> finalset = getIntersection(set,set1);
        System.out.println(finalset);
    }
    public static Set<Integer> getIntersection(Set<Integer> set1, Set<Integer> set2)
    {
        set1.retainAll(set2);
        return set1;
    }
}

