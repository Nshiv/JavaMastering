package arrayListChallenges;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicateElement
{
    public static void main(String[] args) {
        List mylist = new ArrayList<>();
        for(int i =1;i<10;i++)
        {
            mylist.add(i);
        }
        mylist.add(4,6);
        System.out.println(mylist);

        //removing duplicates and printing returned list
        removeDuplicates(mylist);
        System.out.println(mylist);


    }

    public static List removeDuplicates(List list)
    {
        List duplicateElements = new ArrayList<>();
       for(int i=0; i<list.size();i++)
       {
           for(int j=i+1;j<list.size();j++)
           {
               if(list.get(i).equals(list.get(j)))
               {
                   duplicateElements.add(list.get(i));
                   list.remove(j);
                   j--;
               }
           }
       }
       return list;
    }

}
