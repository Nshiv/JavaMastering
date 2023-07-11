/* Given arrays : String[] allCodes ={"001","232","45","4365","43543","86","73"} and String[] assignedCpdes={"232","73"}
need to find out unassigned array */

/* Solution:
-Need to convert both the array in List
-Use Lists remove method to remove elements present in second list
- return that updated list
- again create a array from returned list
- that's it
* */

package collectionsPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCollectionPractice1
{
    public static void main(String[] args)
    {
        String[] allCodes ={"001","232","45","4365","43543","86","73"};
        String[] assignedC0des={"232","73"};
        String[] output = getUnassignedArray(allCodes,assignedC0des);
        for(String t:output)
        {
            System.out.println(t);
        }
    }

    public static String[] getUnassignedArray(String[] allCodes, String[] assignedC0des)
    {
        List<String> list1 = new ArrayList<String>(Arrays.asList(allCodes));
        List<String> list2 = new ArrayList<String>(Arrays.asList(assignedC0des));
        list1.removeAll(list2);
        System.out.println(list1);
        return list1.toArray(new String[list1.size()]);

    }
}
