package collectionsPreparation;

import java.util.ArrayList;
import java.util.List;

/*Write a method that accepts two List<String> as input and returns a new List<String>
that is the concatenation of the two input lists.*/
public class ListConcatenation
{
    public static void main(String[] args)
    {
        List<String> myList = new ArrayList<String>();
        myList.add("Test");
        myList.add("Data");
        List<String> myList1 = new ArrayList<String>();
        myList1.add("Picachu");
        myList1.add("Center");
        List<String> output = getConcateNatedList(myList1,myList);
        System.out.println(output);


    }
    public static List<String> getConcateNatedList(List<String> list1, List<String> list2)
    {
        list1.addAll(list2);
        return list1;
    }
}
