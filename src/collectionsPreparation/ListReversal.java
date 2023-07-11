package collectionsPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static java.util.Collections.list;

/*Write a method that accepts a List<String> as input and returns a new List<String>
 with the elements reversed. The original list should remain unchanged.*/
public class ListReversal
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("Apple", "Banana", "Orange");
        List<String> ouput = getReversed(list);
        System.out.println(ouput);

    }
    public static List<String> getReversed(List<String> list)
    {
        List<String>  reversed = new ArrayList<String>();
        for(int i= list.size()-1;i>=0;i--)
        {
           reversed.add(list.get(i));
        }
        return reversed;
    }
}
