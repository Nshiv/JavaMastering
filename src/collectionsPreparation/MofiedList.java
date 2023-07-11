package collectionsPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MofiedList
{
    public static void main(String[] args)
    {
  List<Integer> myList = Arrays.asList(1,3,5,7,8,9,6,8,8,8,8,8);
  List<Integer> finaloutput = getUpdatedList(myList,8);
  System.out.println(finaloutput);
    }
    public static List<Integer> getUpdatedList(List<Integer> list, int num) {
        List<Integer> updatedList = new ArrayList<>(list); // Create a new list to avoid ConcurrentModificationException

        Iterator<Integer> iterator = updatedList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == num) {
                iterator.remove();
            }
        }

        return updatedList;
    }

}
