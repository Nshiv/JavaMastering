package collectionsPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList
{
    public static void main(String[] args) {
        int[] array = {23,56,2,67,90,6,60};
        List<Integer> output = arrayToList(array);
        System.out.println(output);

    }

    public static List<Integer> arrayToList(int[] arr)
    {
        List<Integer> myList = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            myList.add(arr[i]);
        }
        return myList;
    }
}
