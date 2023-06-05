package arrayListChallenges;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CalculateSum
{
    public static void main(String[] args)
    {
        List<Double> myList =  createList();
        System.out.println(getSum(myList));
    }
    public static double getSum(List list)
    {
        Iterator<Double> iterator = list.iterator();
        double sum = 0;
        while (iterator.hasNext())
        {
          Double element = iterator.next();
          sum=element+sum;
        }return sum;

    }

    public static List createList()
    {
        List<Double> list = new ArrayList<>();
        list.add(12.5);
        list.add(23.6);
        list.add(56.70);
        list.add(12.67);
        return list;
    }
}
