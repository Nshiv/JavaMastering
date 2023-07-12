/*Convert a set to a list*/

package setPrepration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToList
{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(23);
        set.add(4);
        set.add(777);
        set.add(8);
        set.add(8);
        set.add(03);

        List<Integer> newLIst = convertion(set);
        System.out.println(newLIst);
        newLIst.add(8);
        newLIst.add(8);
        System.out.println(newLIst);

    }
    public static List<Integer> convertion(Set<Integer> set)
    {
      List<Integer> list = new ArrayList<Integer>();
      list.addAll(set);
      return list;
    }
}
