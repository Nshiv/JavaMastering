package collectionsPreparationLIst;

import java.util.ArrayList;
import java.util.List;

/*Write a method that accepts two List<Integer> as input and returns a new List<Integer>
that contains only the elements that are common between the two input lists.*/
public class CommonElementList
{
    public static void main(String[] args)
    {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(12);
        myList.add(10);
        myList.add(15);
        List<Integer> myList1 = new ArrayList<Integer>();
        myList1.add(45);
        myList1.add(10);
        myList1.add(12);
        List<Integer> finalList = getCommon(myList1,myList);
        System.out.println(finalList);

    }

    public static List<Integer> getCommon(List<Integer> list1, List<Integer> list2)
    {
        list1.retainAll(list2);
        return list1;
    }

}
