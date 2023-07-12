
/*Remove all duplicates elements from an array*/
package setPrepration;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesArray
{
    public static void main(String[] args) {

        int[] data = {23,56,76,56,23,89,45,89};
        Set<Integer> nset = removeDuplicate(data);
        System.out.println(nset);
    }

    public static Set<Integer> removeDuplicate(int[] array)
    {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<array.length;i++)
        {
            set.add(array[i]);
        }return set;
    }
}
