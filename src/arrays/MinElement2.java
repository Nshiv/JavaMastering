package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinElement2
{
    public static void main(String[] args) {
        int[] returnedarray = readIntegers();
        System.out.println(Arrays.toString(returnedarray));
        int retunedmin = findMin(returnedarray);
        System.out.println(retunedmin);
    }
    public static int[] readIntegers()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter inputs as integers with comma seperation");
        String string = sc.next();
        String[] splits = string.split(",");
        int[] values = new int[splits.length];
        for(int i= 0; i<values.length;i++)
        {
            values[i]=Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    private static int findMin(int[] array)
    {
        int min = Integer.MAX_VALUE;
        for(int number :array)
        {
            if(number<min)
            {
                min=number;
            }
        }return min;
    }


}
