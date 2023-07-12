package collectionsPreparationLIst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List2Array
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(8);
        list.add(67);
        int[] data = getArray(list);
        for(int i=0;i<data.length;i++)
        {
            System.out.println(data[i]);
        }

    }

    public static int[] getArray(List<Integer> list)
    {
        int[] array = new int[list.size()];
        Iterator<Integer> iterator = list.iterator();
        int i=0;
        while (iterator.hasNext())
        {
            array[i]=iterator.next();
            i++;
        }
        return array;
    }
}
