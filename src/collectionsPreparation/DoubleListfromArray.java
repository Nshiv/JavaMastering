package collectionsPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Write a method that accepts an integer array as input and converts it to a list.
For each element in the array, double its value and include the doubled values
in the resulting list.
 */
public class DoubleListfromArray
{
    public static void main(String[] args)
    {
        int[] user_inputs = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " +user_inputs.length +" integer values");
        for(int i=0;i<user_inputs.length;i++)
        {
            user_inputs[i]=sc.nextInt();
        }
        List<Integer> output = getList(user_inputs);
        System.out.println(output);
    }

    public static List<Integer> getList(int[] arr)
    {
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            myList.add(2*arr[i]);
        }
        return myList;
    }
}
