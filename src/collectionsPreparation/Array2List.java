package collectionsPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Write a method that accepts an integer array as input and converts it to a list. However,
 only include the elements in the list that are greater than a given threshold value.
 The threshold value should be passed as a parameter to the method.
* */
public class Array2List
{
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter "+arr.length+" interger numbers");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Treshhold value too :  ");
        int threshHold = sc.nextInt();

        List<Integer> output = getList(arr,10);
        System.out.println(output);

    }

    public static List<Integer> getList(int[] array, int threshHold)
    {
        List<Integer> myLIst = new ArrayList<Integer>();
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>threshHold)
            {
                myLIst.add(array[i]);
            }
        }return myLIst;
    }
}
