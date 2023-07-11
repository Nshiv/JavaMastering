package collectionsPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Write a method that accepts a string array as input and converts it to a list of strings.
The method should return a list where each string element is concatenated with a given prefix.
The prefix should be passed as a parameter to the method.
*/
public class StringListWithPrefix
{
    public static void main(String[] args)
    {
        String[] arr = new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + arr.length+ " strings");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scanner.nextLine();
        }
        System.out.println("Please enter prefix string that you want to add");
        String prefix = scanner.nextLine();
        List<String> output = getList(arr,prefix);
        System.out.println(output);
    }

    public static List<String> getList(String[] array, String prefix)
    {
     List<String> myList = new ArrayList<String>();
     for(int i=0;i<array.length;i++)
     {
         myList.add(prefix+array[i]);
     }
     return myList;

    }

}
