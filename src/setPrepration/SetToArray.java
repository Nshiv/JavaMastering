/*Set to Array*/
package setPrepration;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetToArray
{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(2);
        set.add(89);
        set.add(56);
        set.add(90);
        set.add(4578);

        int[] output = getArray(set);
        for(int i=0;i<output.length;i++)
        {
            System.out.println(output[i]);
        }
    }
    public static int[] getArray(Set<Integer> set)
    {
      int[] data = new int[set.size()];
        Iterator<Integer> iterator= set.iterator();
        int i=0;
        while (iterator.hasNext())
        {
          data[i]=iterator.next();
          i++;
        }
        return  data;
    }
}
