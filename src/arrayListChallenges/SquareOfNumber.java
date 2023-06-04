package arrayListChallenges;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SquareOfNumber
{
    public static void main(String[] args)
    {

        List<Integer> myList = createList();
        System.out.println(myList);
        List<Integer> sqrt = squareRoot(myList);
        System.out.println(sqrt);


    }
    public static List createList()
    {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=10;i++)
        {
            list.add(i);
        } return list;
    }
    public static List squareRoot(List list)
    {
        List<Integer> output = new ArrayList<>();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext())
        {
            int element = iterator.next();
            int square = element* element;
            output.add(square);
        }return output;

    }
}
