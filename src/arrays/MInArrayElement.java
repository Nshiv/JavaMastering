package arrays;

import java.util.Arrays;
import java.util.Scanner;
//approach one
public class MInArrayElement
{
    public static void main(String[] args) {
        System.out.println(finMin(readInteger()));
    }
    public static int[] readInteger()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Enter the Array Elements");
        for(int i=0; i<size;i++)
        {
            myArray[i]=sc.nextInt();
        }
        return myArray;
    }

    public static int finMin(int[] array)
    {
      int[] sortedArray = Arrays.copyOf(array,array.length);
      Arrays.sort(sortedArray);
      int num = sortedArray[0];
      return num;
    }
}
