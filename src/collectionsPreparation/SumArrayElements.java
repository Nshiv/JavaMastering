package collectionsPreparation;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* Write a method that accepts an integer array as input,
* Convert the array to a list and perform the sum calculation using the list.

 */
public class SumArrayElements
{
    public static void main(String[] args) {
        int[] userArray = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter " + userArray.length + " integer values");
        for (int i = 0; i < 5; i++) {
            userArray[i] = sc.nextInt();
        }
        System.out.println(getSum(userArray));
    }

    public static int getSum(int[] arr)
    {
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            myList.add(arr[i]);
        }
        int sum =0;
        for(Integer s : myList)
        {
            sum=sum+s;
        }
        return sum;
    }

}
