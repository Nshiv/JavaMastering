package arrayListChallenges;

import collections.ListArrayList;

import java.util.ArrayList;
import java.util.List;

public class EvenandOddList
{
    public static void main(String[] args)
    {
        List evenList = new ArrayList<>();
        List oddList = new ArrayList<>();

        for(int i=0; i<100;i++)
        {
            if(i%2==0)
            {
                evenList.add(i);
            }else
            {
                oddList.add(i);
            }
        }
        System.out.println(evenList);
        System.out.println(oddList);

    }
}
