package arrayListChallenges;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Experiment
{
    public static void main(String[] args)
    {

        List list = new ArrayList();
        list.add("Shiv");
        list.add("Kumar");
        list.add(85888);
        list.add(282006);
        list.add("Agra-06");
        list.add("Uttar Pradesh");
        list.add("India");
        System.out.println(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            var element = iterator.hasNext();
            System.out.println(element);
        }


    }
}
