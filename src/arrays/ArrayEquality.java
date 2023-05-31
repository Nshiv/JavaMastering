package arrays;

import java.util.Arrays;

public class ArrayEquality
{
    public static void main(String[] args) {
        int[] first = {1,7,0,5,7,8,103948};

        int[] second = {1,7,0,5,7,8,103948};

        if(Arrays.equals(first,second))
        {
            System.out.println("Arrays are equal");
        }
        else
        {
            System.out.println("Arrays are not equal");
        }
    }
}
