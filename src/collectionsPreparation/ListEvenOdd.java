package collectionsPreparation;

/*Write a method that accepts an integer array as input and converts it to a list.
Only include the even numbers from the array in the resulting list.*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEvenOdd
{
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner dc = new Scanner(System.in);
        System.out.println("enter five integers");
        for(int i =0;i<5;i++)
        {
          array[i] = dc.nextInt();
        }
        List<Integer> evenList = new ArrayList<Integer>();
        List<Integer> oddList = new ArrayList<Integer>();
        setEvenOdd(array,evenList,oddList);
        System.out.println("Even List "+ evenList);
        System.out.println("odd list "+ oddList);
    }
    public static void setEvenOdd(int[] arr, List<Integer> evenlist, List<Integer> oddList)
    {
     for(int i=0;i<arr.length;i++)
     {
         if(arr[i]%2==0)
         {
             evenlist.add(arr[i]);
         }
         else
         {
             oddList.add(arr[i]);
         }
     }
    }
}
