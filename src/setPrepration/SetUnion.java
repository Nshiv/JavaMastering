/*Find the Union of Two Sets: Write a function that takes two sets as input
and returns their union (all unique elements from both sets).*/

package setPrepration;
import java.util.HashSet;
import java.util.Set;

public class SetUnion
{
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<Integer>(Set.of(4,6,7,12,56,78));
        Set<Integer> set1 = new HashSet<Integer>(Set.of(4,6,7,19,345,748));
        Set<Integer> finalset = getUnion(set,set1);
        System.out.println(finalset);
    }
    public static Set<Integer> getUnion(Set<Integer> set1, Set<Integer> set2)
    {
      set1.addAll(set2);
      return set1;
    }
}
