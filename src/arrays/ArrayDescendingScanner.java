package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDescendingScanner
{
    public static void main(String[] args)
    {

     int[] integers = getIntegers();
     int[] sortedarray = getDescendingOrder(integers);
     printArray(sortedarray);
    }

    public static int[] getIntegers()
    {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] array= new int[size];
        System.out.println("Emter array Elements");
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.println("Element "+ i+" contains "+array[i]);
        }
    }
    public static int[] getDescendingOrder(int[] nArray)
    {
        int[] sortedarray = Arrays.copyOf(nArray,nArray.length);
        boolean flag =true;
        int temp;
        while (flag)
        {
            flag=false;
            for(int i=0 ; i<sortedarray.length-1;i++)
            {
                if(sortedarray[i]<sortedarray[i+1])
                {
                    temp=sortedarray[i];
                    sortedarray[i]=sortedarray[i+1];
                    sortedarray[i+1]=temp;
                    flag=true;
                }
            }
        }return sortedarray;

    }
}
