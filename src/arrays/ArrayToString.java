package arrays;

import java.util.Arrays;

public class ArrayToString
{
    public static void main(String[] args) {
        int[] newArray;
        newArray = new int[14];
        for(int i=0; i<newArray.length;i++)
        {
            newArray[i]=newArray.length-i;
        }
        String arrayElement = Arrays.toString(newArray);
        System.out.println(arrayElement);
    }

}
