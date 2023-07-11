package collectionsPreparationLIst;

import java.util.*;

/*Write a method that accepts a List<Integer> as input and returns a new List<Integer>
 with the elements sorted in ascending order. The original list should remain unchanged.*/
public class SortedList
{
    public static void main(String[] args)
    {
        List<Integer> myList = Arrays.asList(1,3,5,7,8,9,6,8,454,546,4546,4533);
        List<Integer> output = getSortedArray(myList);
        System.out.println(output);
    }

    public static List<Integer> getSortedArray(List<Integer> list)
    {
        List<Integer> mylist = new ArrayList<>(list);
        //ascending order
        //Collections.sort(mylist);
        //Desending order
        Collections.sort(mylist, Collections.reverseOrder());
        return mylist;
    }
}
